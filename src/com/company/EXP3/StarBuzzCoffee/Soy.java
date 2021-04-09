package com.company.EXP3.StarBuzzCoffee;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return 0;
    }
}
