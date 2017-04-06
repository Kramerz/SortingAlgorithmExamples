package com.company;

public class Main {

    public static void main(String[] args) {
        // BUBBLE SORTING SHOULD BE A LAST CASE SCENARIO AS THERE IS BETTER SORTING ALGORITHMS TO USE
        //THIS WILL SCAN THE COMPLETE ARRAY AND AT THE INDEX OF 0 IT WLL LOOK TO THE RIGHT
        // IF THAT NUMBER IS LARGER THAN THE ONE TO THE LEFT IT WILL STAY, IF IT'S SMALLER THAT 1 ELEMENT
        //WILL SHIFT TO THE RIGHT ONE SPACE.

        int numArray[] = {9, 10, 11, 3, 2, 5, 7, 53};

        System.out.println("ARRAY BEFORE BUBBLE SORT");
        for (int i = 0; i < numArray.length; i++)
        {
            System.out.print(numArray[i] + " ");


        }
        System.out.println();

        BubbleSort.bubbleArray(numArray); //CALLING THE BUBBLE SORT CLASS AND THE EMBEDDED FUNCTION

        System.out.println("ARRAY AFTER BUBBLE SORTING");

        for (int i = 0; i <numArray.length; i++)
        {
            System.out.print(numArray[i] + " ");
        }
        System.out.println();


    }

}