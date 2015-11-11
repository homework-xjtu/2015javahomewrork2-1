package cn.edu.xjtu.se.jackq.simpleui;


import javax.swing.*;
import java.awt.*;

public class UiWindow extends UiContainer {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();

    public UiWindow(){
        frame.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setLocation(400,220);
        frame.setVisible(true);
        frame.setSize(400, 220);
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
    public JComponent getComponent() {
        return panel;
    }
}
