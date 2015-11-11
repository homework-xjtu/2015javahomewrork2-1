package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;

public class UiGroup extends UiContainer {
    private JPanel panel;

    public UiGroup(){
        this.panel = new JPanel();
    }

    @Override
    public void addChild(UiElement element) {
        super.addChild(element);
        panel.add(element.getComponent());
        element.getComponent().doLayout();
        panel.updateUI();
    }

    @Override
    public JComponent getComponent() {
        return panel;
    }
}
