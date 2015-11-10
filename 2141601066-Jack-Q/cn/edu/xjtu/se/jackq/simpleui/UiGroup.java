package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;
import java.awt.*;

public class UiGroup extends UiContainer {
    private JPanel panel;

    public UiGroup(){
        this.panel = new JPanel();

    }

    @Override
    public void addChild(UiElement element) {
        super.addChild(element);
        panel.add(element.getComponent());
        panel.updateUI();
    }

    @Override
    public Component getComponent() {
        return panel;
    }
}
