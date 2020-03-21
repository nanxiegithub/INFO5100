package com.nan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyIndexOutOfBoundException {

    int lowerBound;
    int upperBound;
    int index;

    public MyIndexOutOfBoundException (IndexOutOfBoundsException ex) {
        String message = ex.getMessage().trim();
        lowerBound = 0;
        upperBound = Integer.parseInt(message.substring(message.indexOf("length") + 7)) - 1;
        index = Integer.parseInt(message.substring(message.indexOf("Index") + 6, message.indexOf("out") - 1));
    }

    @Override
    public String toString(){
        return  "Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: " + upperBound;
    }

    public static void main(String[] args) {
	// write your code here
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        try{
            int a = l.get(10);
        } catch (IndexOutOfBoundsException e){
            MyIndexOutOfBoundException myIndexOutOfBoundException = new MyIndexOutOfBoundException(e);
            System.out.println(myIndexOutOfBoundException.toString());
        }
    }
}
