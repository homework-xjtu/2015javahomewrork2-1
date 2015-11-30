package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;

public class UIGroup extends UIContainer {
    private JPanel panel;

    public UIGroup(){
        this.panel = new JPanel();
    }

    @Override
    public void addChild(UIElement element) {
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
