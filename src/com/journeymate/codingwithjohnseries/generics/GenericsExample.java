package com.journeymate.codingwithjohnseries.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

      /*  Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(3.14);
        doublePrinter.print();*/

        Printer<Integer, Double> printer = new Printer<>(23, 2.50);
        printer.print();


        shout("John", 23);


        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        printList(integerList);

    }


    private static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!!!");
    }


    private static <T, V> void shout(T thingToShout, V otherthingToShout) {
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherthingToShout + "!!!!!");
    }

    private static void printList(List<?> myList) {
        System.out.println();
    }
}
