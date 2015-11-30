package cn.edu.xjtu.se.jackq.simpleui;


import java.util.ArrayList;

public abstract class UIContainer extends UIElement {
    protected ArrayList<UIElement> children = new ArrayList<>();

    public void addChild(UIElement element) {
        children.add(element);

    }

}
