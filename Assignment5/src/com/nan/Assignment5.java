package com.nan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment5 {

    public static void main(String[] args) {
        // write your code here

        // 1. Find first non-repeating character and return index
        System.out.println(problemOne("leetcode"));

        // 2. Add all digits until result has only 1 digit
        System.out.println(problemTwo(38));

        // 3. Re-order zero to end
        int[] arrayInput = new int[] {0, 0, 1, 0, 5, 6};
        System.out.println(Arrays.toString(problemThree(arrayInput)));

        // 4. Find longest palindromic substring in string s
        System.out.println(problemFour("babad"));

        // 5. rotate (clockwise) 90 degree of n*n matrix
        int[][] matrixinput = new int[3][3];
        matrixinput[0][0] = 1;
        matrixinput[0][1] = 2;
        matrixinput[0][2] = 3;
        matrixinput[1][0] = 4;
        matrixinput[1][1] = 5;
        matrixinput[1][2] = 6;
        matrixinput[2][0] = 7;
        matrixinput[2][1] = 8;
        matrixinput[2][2] = 9;
        int[][] matrixOutput = problemFive(matrixinput);
        for (int[] row: matrixOutput){
            System.out.println(Arrays.toString(row));
        }

    }

    // 1. Find first non-repeating character and return index
    public static int problemOne(String strInput) {
        if (strInput == null) {
            return -1;
        }

        Map<Character, Integer> count = new HashMap<>();
        for (char c : strInput.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < strInput.length(); i ++) {
            if (count.get(strInput.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }


    // 2. Add all digits until result has only 1 digit
    public static int problemTwo (int intInput){

        int result = intInput;
        while (result >= 10) {
            int temp = 0;
            while (result != 0) {
                temp += result % 10;
                result = result / 10;
            }
            result = temp;
        }
        return result;
    }


    // 3. Re-order zero to end
    public static int[] problemThree(int[] arrayInput) {

        int nonZeroCount = 0;
        int temp;

        for (int i = 0; i < arrayInput.length; i ++) {
            if (arrayInput[i] != 0){
                temp = arrayInput[nonZeroCount];
                arrayInput[nonZeroCount] = arrayInput[i];
                arrayInput[i] = temp;
                nonZeroCount += 1;
            }
        }

        return arrayInput;
    }


    // 4. Find longest palindromic substring in string s
    public static String problemFour(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i ++) {
            String temp = findPalindromic(s, i);
            if (temp.length() > result.length()) {
                result = temp;
            }
        }

        return result;
    }

    private static String findPalindromic(String s, int index) {
        String s1 = null, s2 = null;
        int left = index;
        int right = index;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;
        }
        s1 = s.substring(left + 1, right);

        left = index;
        right = index + 1;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;
        }
        s2 = s.substring(left + 1, right);

        return s1.length() > s2.length() ? s1 : s2;
    }


    // 5. rotate (clockwise) 90 degree of n*n matrix
    public static int[][] problemFive(int[][] matrixInput) {

        int[][] matrixOutput = new int[matrixInput.length][matrixInput[0].length];
        int j = 0;

        for (int row = 0; row < matrixInput.length; row ++) {
            int i = matrixInput[0].length - 1;
            for (int col= 0; col < matrixInput[0].length; col ++){
                matrixOutput[row][col] = matrixInput[i][j];
                i --;
            }

            j ++;

        }

        return matrixOutput;

    }




}
