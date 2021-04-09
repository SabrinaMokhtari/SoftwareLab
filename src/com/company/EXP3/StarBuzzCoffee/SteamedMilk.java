package com.company.EXP3.StarBuzzCoffee;

public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage beverage) {
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
