package com.company;

public class MyRect {
    public MyRect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double width;
    private double height;

    public double ComputeArea() throws Exception{
        // PreCondition
        if (width <= 0 || height <= 0){
            throw new ArithmeticException("width or height are not positive");
        }
        //PostCondition
        return (width * height);
    }
}


