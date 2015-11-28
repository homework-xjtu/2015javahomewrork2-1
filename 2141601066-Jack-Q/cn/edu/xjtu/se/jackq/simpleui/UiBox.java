package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UIBox extends UIElement implements IUIUpdatable, IUIStateSavable<UIBox> {
    private static Random random = new Random();
    private JPanel box = new JPanel();

    public UIBox() {
        box.setSize(30, 30);
        updateUI();
    }

    @Override
    public void updateUI() {
        box.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
    }


    @Override
    public UIBox loadStateFromString(String state) {
        Pattern hexColorPattern = Pattern.compile("#([0-9A-Fa-f]{2})([0-9A-Fa-f]{2})([0-9A-Fa-f]{2})",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = hexColorPattern.matcher(state);
        if(matcher.find()){

            String red = matcher.group(1);
            String green = matcher.group(2);
            String blue = matcher.group(3);

            box.setBackground(new Color(
                    Integer.parseInt(red, 16),
                    Integer.parseInt(green, 16),
                    Integer.parseInt(blue, 16)
            ));
        }

        return this;
    }

    @Override
    public String getStateString() {
        Color color = box.getBackground();
        return String.format("[BUTTON-COLOR] #%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }

    @Override
    public JComponent getComponent() {
        return box;
    }
}
