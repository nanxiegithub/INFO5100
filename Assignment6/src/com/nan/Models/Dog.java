package com.nan.Models;

import java.time.LocalDate;

public class Dog extends Pet implements Boardable{

    private String size;
    public LocalDate boardStart;
    public LocalDate boardEnd;

    public Dog(String name, String ownerName, String color,String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString(){
        return "DOG:\n" + getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex() + "\nSize: " + getSize();
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
