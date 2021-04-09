package com.company.EXP3.StarBuzzCoffee;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
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
