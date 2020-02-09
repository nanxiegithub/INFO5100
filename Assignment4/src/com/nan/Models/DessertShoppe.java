package com.nan.Models;

public class DessertShoppe {

    double taxRate = 0.065;
    String storeName = "M & M Dessert Shoppe";

    public String cents2dollarsAndCentsmethod(int cost){

        String cost2dollar = String.valueOf(cost/100.00);

        return cost2dollar;

    }

}
