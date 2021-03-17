package com.company;

public class MyRect {
    public MyRect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    private double width;
    private double height;

    public double ComputeArea() throws Exception{
        if (width <= 0 || height <= 0){
            throw new ArithmeticException("width or height are not positive");
        }
        return (width * height);
    }
}
