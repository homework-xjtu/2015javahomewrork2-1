package cn.edu.xjtu.se.jackq.simpleui;


import java.util.ArrayList;

public abstract class UiContainer extends UiElement {
    protected ArrayList<UiElement> children = new ArrayList<>();

    public void addChild(UiElement element){
        children.add(element);

    }

}
