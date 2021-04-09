package com.company.EXP3.StarBuzzCoffee;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        super(beverage);
        this.description = "whip";
        this.cost = 0.1;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double cost() {
        return super.cost();
    }
}
