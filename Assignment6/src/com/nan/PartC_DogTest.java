package com.nan;

import com.nan.Models.Cat;
import com.nan.Models.Dog;
import com.nan.Models.Pet;

public class PartC_DogTest {
    public static void main(String[] args) {
        // write your code here
        Dog dog = new Dog("Spot", "Susan", "white","meduim");
        dog.setSex(2);
        System.out.println(dog);

        dog.setBoardEnd(10, 1, 2019);
        dog.setBoardStart(9, 1, 2019);
        System.out.println(dog.boarding(10, 1, 2019));

    }
}
