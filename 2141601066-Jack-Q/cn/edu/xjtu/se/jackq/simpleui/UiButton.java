package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class UiButton extends UiElement {
    private JButton button;
    public UiButton(String s, IUiEventHandler handler){
        this.button = new JButton();
        this.button.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handler.onEvent();
            }
        });
        this.button.setText(s);
    }

    @Override
    public JButton getComponent() {
        return button;
    }
}
