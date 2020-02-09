package com.nan.Models;


public class Cookie extends DessertItem{

    int piece;
    double pricePerDozen;

    public Cookie(String name, int piece, double pricePerDozen) {
        super(name);
        this.piece = piece;
        this.pricePerDozen = pricePerDozen;
    }


    @Override
    public int getCost() {
        int cost = (int)Math.round(piece * pricePerDozen/12);
        return cost;
    }
}
