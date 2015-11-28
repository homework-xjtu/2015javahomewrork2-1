package cn.edu.xjtu.se.jackq.simpleui;


public interface IUIStateSavable<Element extends UIElement> {
    public Element loadStateFromString(String state);
    public String getStateString();
}
