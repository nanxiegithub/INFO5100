package com.nan.Models;

public class Pet {

    private String name, ownerName, color, sex;
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int SPAYED = 2;
    public static final int NEUTERED = 3;

    public Pet(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setSex(int sexid){
        if (sexid == MALE){
            sex = "MALE";
        }else if (sexid == FEMALE){
            sex = "FEMALE";
        }else if (sexid == SPAYED){
            sex= "SPAYED";
        }else if (sexid == NEUTERED){
            sex = "NEUTERED";
        }

    }

    public String getSex(){
        return sex;
    }

    public String toString(){
        return getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex();
    }
}
