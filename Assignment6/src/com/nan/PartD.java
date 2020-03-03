package com.nan;

public class PartD {
    public static void main(String[] args) {
        // write your code here
        int[] A = new int[] {1,3,3,4};
        System.out.println(findClosestIndex(A, 2));

        int[] B = new int[] {0, 1, 5};
        System.out.println(findClosestIndex(B, 7));

        int[] C = new int[] {};
        System.out.println(findClosestIndex(C, 2));
//
//        System.out.println(findClosestIndex(null, 2));

    }

    public static int findClosestIndex(int[] A, int t){

        if(A == null){
            throw new RuntimeException("Input is null");
        }else if(A.length ==0 ){
            throw new RuntimeException("Input is empty");
        }

        int i, diff;
        int left = 0;
        int right = A.length-1;

        while(right - left >1) {
            i = left + (right - left)/2;
            diff = Math.abs(A[i] - t);

            if ((A[i] - t) == 0 | (Math.abs(A[i + 1] - t) > diff & Math.abs(A[i - 1] - t) > diff) |((A[i] - t) < 0 & Math.abs(A[i + 1] - t) > diff) | ((A[i] - t) >0 & Math.abs(A[i -1] - t) > diff) ) {
                return i;
            } else if ((A[i] - t) < 0){
                left = i;
            } else {
                right = i;
            }

        }

        if(Math.abs(A[right] - t) >= Math.abs(A[left] - t) ){
            return left;
        }else{
            return right;
        }

    }


}
