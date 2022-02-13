package com.journeymate.codingwithjohnseries.sort;

import java.util.Random;

public class QuickSortAlgorithm {
    /**
     * Quick sort is a recursive algorithm
     * How quick sort algorithm works ? Basically 3 steps
     * step 1: choose one of the number in your array as the pivot
     * E.g. 1 8 3 9 4 5 7
     * step 2: choose number "lower than the pivot -> left of array" and "higher than the pivot -> right of array" - this technique is also called partitioning
     * 5 4 3 1 7 8 9
     *
     * condition: left pointer > than pivot right pointer < pivot based on the conditions swap the numbers of right pointer and left pointer
     *
     * step 3: do a quick sort of numbers to the left of pivot and all the values to the right of pivot recursively
     *
     */

    public static void main(String[] args) {
        Random random = new Random();
        // declare an array size of 10
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            // 10 integers randomly between 0 and 99
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before : ");
        printArray(numbers);

        // perform quicksort here
        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("After : ");
        printArray(numbers);
    }

    private static void quicksort(int[] numbers, int lowIndex, int highIndex) {
        // choose the pivot
        int pivot = numbers[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

        }

    }

    private static void printArray(int[] numbers) {
        for (int element : numbers) {
            System.out.println(element);
        }
    }
}
