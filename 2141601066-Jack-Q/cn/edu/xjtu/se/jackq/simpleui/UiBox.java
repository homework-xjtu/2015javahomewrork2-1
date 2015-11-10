package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class UiBox extends UiElement implements IUiUpdatable, IUiStateSavable<UiBox> {
    private static Random random = new Random();
    private JPanel box = new JPanel();

    public UiBox() {
        box.setSize(30, 30);
        updateUi();
    }

    @Override
    public void updateUi() {
        box.setBackground(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
    }


    @Override
    public UiBox loadStateFromString(String state) {
        box.setBackground(new Color(Integer.parseInt(state)));
        return this;
    }

    @Override
    public String getStateString() {
        return Integer.toString(box.getBackground().getRGB());
    }

    @Override
    public Component getComponent() {
        return box;
    }
}
