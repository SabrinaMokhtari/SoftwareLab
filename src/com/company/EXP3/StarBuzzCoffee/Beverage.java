package com.company.EXP3.StarBuzzCoffee;

public abstract class Beverage {
    public String description = "";
    public double cost = 0;

    public String getDescription() {
        return "Delicious " + this.description;
    }

    public double cost() {
        return this.cost;
    }
}
