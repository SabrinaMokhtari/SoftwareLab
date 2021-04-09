package com.company.EXP3.StarBuzzCoffee;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
        this.description = "mocha";
        this.cost = 0.2;
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
