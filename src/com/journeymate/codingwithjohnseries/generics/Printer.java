package com.journeymate.codingwithjohnseries.generics;

public class Printer<T, V> {

    T thingToPrint;
    V otherThingToShout;


    public Printer(T thingToPrint, V otherThingToShout) {
        this.thingToPrint = thingToPrint;
        this.otherThingToShout = otherThingToShout;
    }

    public void print() {
        System.out.println(thingToPrint);
        System.out.println(otherThingToShout);
    }
}
