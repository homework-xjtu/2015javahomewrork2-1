package cn.edu.xjtu.se.jackq.simpleui;

import java.awt.*;

public abstract class UiElement {
    private int x;
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract Component getComponent();

}
