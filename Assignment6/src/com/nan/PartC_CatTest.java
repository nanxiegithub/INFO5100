package com.nan;

import com.nan.Models.Cat;
import com.nan.Models.Mreview;
import com.nan.Models.Pet;

public class PartC_CatTest {
    public static void main(String[] args) {
        // write your code here
        Cat cat = new Cat("Tom", "Bob", "black","short");
        cat.setSex(2);
        System.out.println(cat);

        cat.setBoardEnd(10, 1, 2019);
        cat.setBoardStart(9, 1, 2019);
        System.out.println(cat.boarding(10, 1, 2019));

    }
}
