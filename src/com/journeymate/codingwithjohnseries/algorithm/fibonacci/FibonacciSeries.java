package com.journeymate.codingwithjohnseries.algorithm.fibonacci;

public class FibonacciSeries {

    // use hashtable, hashmap or array to store in a instance variable
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 40;
        // declare array size to calculate nth fibonacci number
        fibonacciCache = new long[n+1];

        for (int i =0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static long fibonacci(int n) {
        // base case
        if (n <= 1) return n;

        // primitives can never be null
        // stop and return the value that has already been calculated
        if (fibonacciCache[n] != 0) return fibonacciCache[n];

        /**
         * f(n) = f(n-1) + f(n-2)
         * the problem with this algorithm is we recalculate all of the fibonacci numbers all we have solved
         * f(6) = f(5) + f(4)
         * f(5) = f(4) + (3)
         * f(4) = f(3) + f(2)
         * f(3) = f(2) + f(1)
         * f(2) = f(1) + f(0)
         * solution : use Memoization technique and save the calculated fibonacci number and lookup
         */
        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
