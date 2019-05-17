package com.course.java.basics.challenges._package;


public class Series {
    public Series() {
    }

    public static long nSum(int n) {
        return n > 0 ? (long)n + nSum(n - 1) : (long)n;
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1L;
        } else {
            return n > 1 ? (long)n * factorial(n - 1) : (long)n;
        }
    }

    public static long fibonacci(int num) {

        if (num <= 0) {
            return 0;
        }
        long n1 = 0;
        long n2 = 1;
        for (int i = 1; i < num; i++) {
            final long next = n2 + n1;
            n1 = n2;
            n2 = next;
        }
        return n2;
    }
}