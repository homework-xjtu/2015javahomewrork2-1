package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class UIButton extends UIElement {
    private JButton button;
    public UIButton(String s, IUIEventHandler handler){
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
