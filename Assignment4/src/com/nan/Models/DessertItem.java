package com.nan.Models;

public abstract class DessertItem {

    protected java.lang.String name;

    public DessertItem(java.lang.String name){
        this.name = name;
    }

    public final java.lang.String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getCost();


}
