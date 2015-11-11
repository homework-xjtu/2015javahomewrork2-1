package cn.edu.xjtu.se.jackq.simpleui;


import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static ArrayList<IUiStateSavable> stateSavableList = new ArrayList<>();
    public static UiUpdater updater;
    public static UiWindow window;

    public static void main(String[] args) {
        window = new UiWindow();
        updater = new UiUpdater(300);
        // Container-2: A blink row
        window.addChild(createBlinkRow());

        // Add elements row 1
        UiContainer container1 = new UiGroup();
        window.addChild(container1);

        container1.addChild(createBox());

        UiText text1 = new UiText("Welcome to Simple UI");
        container1.addChild(text1);
        stateSavableList.add(text1);

        container1.addChild(createBox());

        // Container-2: Another blink row
        window.addChild(createBlinkRow());

        // Container-3: Control the file storage of states of controls
        UiContainer container3 = new UiGroup();
        window.addChild(container3);
        container3.addChild(new UiButton("Save State", () -> UiStateManager.get().saveState(stateSavableList)));
        container3.addChild(new UiButton("Change Text", () -> text1.setText("Changed text @ " + new Date())));
        container3.addChild(new UiButton("Load State", () -> UiStateManager.get().loadState(stateSavableList)));

        // Container-4: Control the blink of boxes
        UiContainer container4 = new UiGroup();
        window.addChild(container4);
        container4.addChild(new UiButton("Blink", updater::start));
        container4.addChild(new UiButton("Stop", updater::stop));
    }

    private static UiContainer createBlinkRow() {
        UiContainer row = new UiGroup();
        for (int i = 0; i < 20; i++) {
            row.addChild(createBox());
        }
        return row;
    }

    private static UiBox createBox() {
        UiBox box = new UiBox();
        updater.add(box);
        stateSavableList.add(box);
        return box;
    }


}
