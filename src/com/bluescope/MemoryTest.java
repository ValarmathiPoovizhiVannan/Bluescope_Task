package com.bluescope;

public class MemoryTest {
    public static void main(String[] args) {
        System.out.println("Program Started...");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Initial Free Memory: " + runtime.freeMemory());

        int[] bigArray = new int[50_000_000]; // allocate large array
        System.out.println("After Allocation Free Memory: " + runtime.freeMemory());

        bigArray = null;   // remove reference
        System.gc();       // suggest garbage collection

        System.out.println("After GC Free Memory: " + runtime.freeMemory());
        System.out.println("Program Completed.");
    }
}

