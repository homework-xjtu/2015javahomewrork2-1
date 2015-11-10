package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class UiButton extends UiElement {
    private JButton button;
    public UiButton(String s, IUiEventHandler handler){
        this.button = new JButton(s);
        this.button.setName("123");
        this.button.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handler.onEvent();
            }
        });
    }

    @Override
    public Component getComponent() {
        return button;
    }
}
