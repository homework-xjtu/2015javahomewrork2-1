package cn.edu.xjtu.se.jackq.simpleui;


public interface IUiStateSavable<Element extends UiElement> {
    public Element loadStateFromString(String state);
    public String getStateString();
}
