package com.test;

public class RectangleButton extends CircleButton{
    private String Shape = "我是方形按钮！";
    public RectangleButton(){
        this.Shape = Shape;
    }
    @Override
    public String getShape() {
        return Shape;
    }

}
