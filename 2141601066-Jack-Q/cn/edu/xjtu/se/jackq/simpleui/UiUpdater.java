package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;
import java.util.ArrayList;

public class UIUpdater {
    private Timer timer;

    protected ArrayList<IUIUpdatable> updatableChildren = new ArrayList<>();

    public void stop() {
        timer.stop();
    }

    public void start() {
        timer.start();
    }

    public UIUpdater(int interval) {
        timer = new Timer(interval, (event) -> updatableChildren.forEach(IUIUpdatable::updateUI));
        timer.start();
    }

    public void setInterval(int interval) {
        timer.setDelay(interval);
        timer.restart();
    }

    public void add(IUIUpdatable updatable) {
        updatableChildren.add(updatable);
    }
}
