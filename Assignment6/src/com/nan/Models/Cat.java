package com.nan.Models;

import java.time.LocalDate;
import java.util.Date;

public class Cat extends Pet implements Boardable{

    private String hairLength;
    public LocalDate boardStart;
    public LocalDate boardEnd;


    public Cat(String name, String ownerName, String color,String hairLength) {
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    @Override
    public String toString(){
        return "CAT:\n" + getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex() + "\nHair: " + getHairLength();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        boardStart = LocalDate.of(year, month, day);

    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        boardEnd = LocalDate.of(year, month, day);
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        LocalDate boardDate = LocalDate.of(year, month, day);

        if (boardDate.isAfter(boardStart) & boardDate.isBefore(boardEnd) |boardDate.equals(boardEnd)|boardDate.equals(boardStart)){
            return true;
        }else{
            return false;

        }

    }
}
