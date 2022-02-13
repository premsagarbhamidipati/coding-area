package com.journeymate.algorithms;

public class ArrayStructures {

    private int[] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray() {
        for (int i=0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random()*10) + 10;
        }
    }

    public void printArray() {
        System.out.println("--------------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");

            System.out.println(theArray[i] + " |");
            System.out.println("-------------");
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) return theArray[index];

        return 0;
    }

    // delete index from the array
    public void deleteIndex(int index) {
        if (index < arraySize)  {
            for (int i = index; i < (arraySize - 1); i++) {
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }


    // insert into array
    public void insertIndex(int val) {

        if (arraySize < 50) {
            theArray[arraySize] = val;
            arraySize++;
        }

    }

    public boolean doesArrContainThisValue(int searchValue) {
        boolean valueInArray = false;
        for (int i=0; i < arraySize; i++) {
            if (theArray[i] == searchValue) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }


    public String linearSearchForValue(int value) {
        boolean valueInArray = false;

        String indexWithValue = "";

        System.out.println("The value was found in the following : ");

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                valueInArray = true;
                System.out.print(i + " ");
                indexWithValue += i + " ";
            }
        }
        if (!valueInArray) {
            indexWithValue = "None";
            System.out.println(indexWithValue);
        }
        System.out.println();
        return indexWithValue;
    }


    public static void main(String[] args) {
        ArrayStructures arrayStructures = new ArrayStructures();
        arrayStructures.generateRandomArray();
        arrayStructures.printArray();
        System.out.println(arrayStructures.getValueAtIndex(3));
        System.out.println(arrayStructures.doesArrContainThisValue(18));
        arrayStructures.deleteIndex(4);
        // to print array after delete
        arrayStructures.printArray();

        arrayStructures.insertIndex(55);
        // print array after insert
        arrayStructures.printArray();

        arrayStructures.linearSearchForValue(17);

    }
}
