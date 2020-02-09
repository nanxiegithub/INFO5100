package com.nan.Models;

public class IceCream extends DessertItem {

    int cost;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

}
