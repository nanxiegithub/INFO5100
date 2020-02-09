package com.nan.Models;

import java.util.Vector;

public class Checkout {

    Vector<DessertItem> dessertItemVector = new Vector<>();
    DessertShoppe storeInfo = new DessertShoppe();

    public int numberOfItems() {
        return dessertItemVector.size();
    }

    public void enterItem(DessertItem item) {
        dessertItemVector.add(item);
    }

    public void clear() {
        dessertItemVector.clear();
    }

    public int totalCost() {

        int totalCost = 0;
        for (int index = 0; index < dessertItemVector.size(); index++) {
            DessertItem item = dessertItemVector.get(index);
            totalCost += item.getCost();
            ;
        }

        return totalCost;
    }

    public int totalTax() {

        int totalCost = totalCost();

        return (int) Math.round(totalCost * storeInfo.taxRate);
    }

    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("          " + storeInfo.storeName + "          \n");
        sb.append("          --------------------          \n");

        for (int index = 0; index < dessertItemVector.size(); index++) {
            DessertItem item = dessertItemVector.get(index);
            if (item instanceof Candy) {
                Candy candy = (Candy) item;
                sb.append(String.valueOf(candy.weight/1.00) + " lbs. @ " +  String.valueOf(candy.pricePerPound/100.00) + " /lb.\n");
                sb.append(candy.name);
                fillSpace(sb, candy.name, storeInfo.cents2dollarsAndCentsmethod(candy.getCost()));
                sb.append(storeInfo.cents2dollarsAndCentsmethod(candy.getCost()) + "\n");
            } else if (item instanceof Cookie) {
                Cookie cookie = (Cookie) item;
                sb.append(cookie.piece + " @ " + String.valueOf(cookie.pricePerDozen/100.00) + " /dz.\n");
                sb.append(cookie.name);
                fillSpace(sb, cookie.name, storeInfo.cents2dollarsAndCentsmethod(cookie.getCost()));
                sb.append(storeInfo.cents2dollarsAndCentsmethod(cookie.getCost()) + "\n");
            } else if (item instanceof IceCream) {

                if (item instanceof Sundae){
                    Sundae sundae = (Sundae)item;
                    sb.append(sundae.toppingName + " Sundea with\n");
                    sb.append(sundae.name);
                    fillSpace(sb, sundae.name, storeInfo.cents2dollarsAndCentsmethod(sundae.getCost()));
                    sb.append(storeInfo.cents2dollarsAndCentsmethod(sundae.getCost()) + "\n");
                }else{
                    IceCream iceCream = (IceCream) item;
                    sb.append(iceCream.name);
                    fillSpace(sb, iceCream.name, storeInfo.cents2dollarsAndCentsmethod(iceCream.getCost()));
                    sb.append(storeInfo.cents2dollarsAndCentsmethod(iceCream.getCost()) + "\n");

                }

            }
        }

        sb.append("\n\nTax");
        fillSpace(sb, "Tax", storeInfo.cents2dollarsAndCentsmethod(totalTax()));
        sb.append(storeInfo.cents2dollarsAndCentsmethod(totalTax()));
        sb.append("\nTotal Cost");
        fillSpace(sb, "Total Cost",  storeInfo.cents2dollarsAndCentsmethod((totalCost()+totalTax())));
        sb.append(storeInfo.cents2dollarsAndCentsmethod((totalCost()+totalTax())));

        return sb.toString();
    }

    private void fillSpace(StringBuilder sb, String left, String right) {
        int i = 0;
        while (i < 40 - left.length() - right.length()) {
            sb.append(" ");
            i ++;
        }
    }

}
