package com.journeymate.fundamentals;

public class MathRandomExample {

    // generate random numbers within 1 to 10
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        for (int i=0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
        }
    }
}
