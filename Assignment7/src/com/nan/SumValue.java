package com.nan;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class SumValue {

    static void generateRandomArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt();
        }
    }

    static long sum(int[] arr) {
        AtomicInteger index = new AtomicInteger(0);
        AtomicLong sum = new AtomicLong(0);

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    while (index.get() < arr.length) {
                        int curr = index.getAndAdd(1);
                        sum.addAndGet(arr[curr]);
                    }
                }
            });

            executorService.shutdown();
            executorService.awaitTermination(5000, TimeUnit.SECONDS);
        } catch (Exception ex) {
            System.out.println("Calculation interrupted");
        }

        return sum.get();
    }

    public static void main(String[] args) {
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " +sum);

    }
}
