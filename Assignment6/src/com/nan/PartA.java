package com.nan;

import com.nan.Models.Mreview;

public class PartA{

    public static void main(String[] args) {
	// write your code here
        Mreview lengendof1900 = new Mreview("1900");

        lengendof1900.addRating(9);
        lengendof1900.addRating(10);
        lengendof1900.addRating(9);

        System.out.println(lengendof1900.toString());


    }
}
