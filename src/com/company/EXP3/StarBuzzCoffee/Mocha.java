package com.company.EXP3.StarBuzzCoffee;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
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
