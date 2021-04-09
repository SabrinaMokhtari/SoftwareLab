package com.company.EXP3.StarBuzzCoffee;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }
}
