package com.test;

public class CircleButton implements AbstractButton {
    private String Shape = "我是圆形按钮！";
    public CircleButton(){
        this.Shape = Shape;
    }
    @Override
    public String getShape() {
        return Shape;
    }
}
