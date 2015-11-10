package cn.edu.xjtu.se.jackq.simpleui;


import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UiWindow window = new UiWindow();
        UiUpdater updater = new UiUpdater(300);
// Add elements row 0
        UiContainer container0 = new UiGroup();
        window.addChild(container0);

        for (int i = 0; i < 20; i++) {
            UiBox box0 = new UiBox();
            container0.addChild(box0);
            updater.add(box0);
        }
        // Add elements row 1
        UiContainer container1 = new UiGroup();
        window.addChild(container1);

        UiBox box1 = new UiBox();
        container1.addChild(box1);
        updater.add(box1);

        UiText text1 = new UiText("Welcome to Simple UI");
        container1.addChild(text1);
        // Add elements row 2
        UiContainer container2 = new UiGroup();
        window.addChild(container2);

        for (int i = 0; i < 20; i++) {
            UiBox box2 = new UiBox();
            container2.addChild(box2);
            updater.add(box2);
        }

        UiContainer container3 = new UiGroup();
        window.addChild(container3);
        container3.addChild(new UiButton("Save", ()->{
            try {
                FileOutputStream fos = new FileOutputStream("state.txt",false);
                Writer writer = new OutputStreamWriter(fos);
                writer.write(text1.getStateString());
                writer.append('\n');
                writer.write(box1.getStateString());
                writer.append('\n');
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        container3.addChild(new UiButton("Change", ()-> text1.setText("Changed text @ "+new Date())));
        container3.addChild(new UiButton("Load", ()->{
            try {
                Scanner sc = new Scanner(new FileInputStream("state.txt"));
                text1.loadStateFromString(sc.nextLine());
                box1.loadStateFromString(sc.nextLine());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }));
    }
}
