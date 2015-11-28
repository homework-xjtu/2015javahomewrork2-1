package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;


public class UIText extends UIElement implements IUIStateSavable<UIText> {
    private JLabel label;

    public UIText(String string) {
        this.label = new JLabel(string);
    }

    public UIText() {
        this("");
    }

    public void setText(String s) {
        this.label.setText(s);
    }

    @Override
    public UIText loadStateFromString(String state) {
        label.setText(state);
        return this;
    }

    @Override
    public String getStateString() {
        return label.getText();
    }

    @Override
    public JComponent getComponent() {
        return label;
    }
}
