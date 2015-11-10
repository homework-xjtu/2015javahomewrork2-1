package cn.edu.xjtu.se.jackq.simpleui;


import javax.swing.*;
import java.awt.*;

public class UiWindow extends UiContainer {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();

    public UiWindow(){
        frame.add(panel);
        frame.setLocation(300,200);
        frame.setVisible(true);
        frame.setSize(300, 200);
        frame.setBackground(Color.white);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void addChild(UiElement element) {
        super.addChild(element);
        panel.add(element.getComponent());
frame.repaint();
    }


    @Override
    public Component getComponent() {
        return frame;
    }
}
