package com.bluescope;

public class SimpleThread {

    private int count = 0;

     public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws Exception {

        SimpleThread demo = new SimpleThread();

         Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                demo.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                demo.increment();
            }
        });

         t1.start();
        t2.start();
 
        t1.join();
        t2.join();

         System.out.println("Final Count = " + demo.count);
    }
}
