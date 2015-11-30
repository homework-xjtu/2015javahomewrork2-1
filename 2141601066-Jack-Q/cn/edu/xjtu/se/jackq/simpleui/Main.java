package cn.edu.xjtu.se.jackq.simpleui;


import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static ArrayList<IUIStateSavable> stateSavableList = new ArrayList<>();
    public static UIUpdater updater;
    public static UIWindow window;

    public static void main(String[] args) {
        window = new UIWindow();
        updater = new UIUpdater(300);
        // Container-2: A blink row
        window.addChild(createBlinkRow());

        // Add elements row 1
        UIContainer container1 = new UIGroup();
        window.addChild(container1);

        container1.addChild(createBox());

        UIText text1 = new UIText("Welcome to Simple UI");
        container1.addChild(text1);
        stateSavableList.add(text1);

        container1.addChild(createBox());

        // Container-2: Another blink row
        window.addChild(createBlinkRow());

        // Container-3: Control the file storage of states of controls
        UIContainer container3 = new UIGroup();
        window.addChild(container3);
        container3.addChild(new UIButton("Save State", () -> UIStateManager.get().saveState(stateSavableList)));
        container3.addChild(new UIButton("Change Text", () -> text1.setText("Changed text @ " + new Date())));
        container3.addChild(new UIButton("Load State", () -> UIStateManager.get().loadState(stateSavableList)));

        // Container-4: Control the blink of boxes
        UIContainer container4 = new UIGroup();
        window.addChild(container4);
        container4.addChild(new UIButton("Blink", updater::start));
        container4.addChild(new UIButton("Stop", updater::stop));
    }

    private static UIContainer createBlinkRow() {
        UIContainer row = new UIGroup();
        for (int i = 0; i < 20; i++) {
            row.addChild(createBox());
        }
        return row;
    }

    private static UIBox createBox() {
        UIBox box = new UIBox();
        updater.add(box);
        stateSavableList.add(box);
        return box;
    }


}
