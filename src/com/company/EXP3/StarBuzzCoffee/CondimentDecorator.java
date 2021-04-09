package com.company.EXP3.StarBuzzCoffee;

public abstract class CondimentDecorator implements Beverage{
    Beverage beverage;
    CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }
}
