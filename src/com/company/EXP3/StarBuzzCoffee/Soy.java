package com.company.EXP3.StarBuzzCoffee;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
        this.description = "soy";
        this.cost = 0.15;
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
