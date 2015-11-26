package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;


public class UiText extends UiElement implements IUiStateSavable<UiText> {
    private JLabel label;

    public UiText(String string) {
        this.label = new JLabel(string);
    }

    public UiText() {
        this("");
    }

    public void setText(String s) {
        this.label.setText(s);
    }

    @Override
    public UiText loadStateFromString(String state) {
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
