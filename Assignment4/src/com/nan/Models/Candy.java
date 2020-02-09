package com.nan.Models;

public class Candy extends DessertItem{

    double weight;
    double pricePerPound;

    public Candy(String name, double weight, double pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }


    @Override
    public int getCost() {
        int cost = (int)Math.round(weight * pricePerPound);
        return cost;
    }
}
