package cn.edu.xjtu.se.jackq.simpleui;

import javax.swing.*;
import java.util.ArrayList;

public class UiUpdater {
    private Timer timer;

    protected ArrayList<IUiUpdatable> updatableChildren = new ArrayList<>();


    public UiUpdater(int interval) {
        timer = new Timer(interval, (event) -> updatableChildren.forEach(IUiUpdatable::updateUi));
        timer.start();
    }

    public void setInterval(int interval){
        timer.setDelay(interval);
        timer.restart();
    }

    public void add(IUiUpdatable updatable) {
        updatableChildren.add(updatable);
    }
}
