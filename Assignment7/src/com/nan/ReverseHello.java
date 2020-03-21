package com.nan;

public class ReverseHello extends Thread {

    int threadSize = 50;

    public ReverseHello() {

        Thread thread;
        int n = 1;

        while (n < (threadSize + 1)) {
            final int num = n;
            thread = new Thread(new Runnable() {
                public void run() {
                    int i = threadSize + 1 - num;
                    System.out.println("Hello from Thread " + i);
                }

            });
            thread.start();
            try {
                thread.join ();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            n ++;
        }
    }

    public static void main(String args[]) {
        (new ReverseHello()).start();
    }

}