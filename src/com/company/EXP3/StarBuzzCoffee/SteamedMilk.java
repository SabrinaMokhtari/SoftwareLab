package com.company.EXP3.StarBuzzCoffee;

public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage beverage) {
        super(beverage);
        this.description = "milk";
        this.cost = 0.1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with " + this.description;
    }

    @Override
    public double cost() {
        return super.cost() + this.cost;
    }
}
