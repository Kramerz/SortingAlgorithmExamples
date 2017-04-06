package com.company;

/**
 * Created by ryan on 4/5/17.
 */
public class BubbleSort {

    static void bubbleArray(int[] numArray) {
        int n = numArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-1); j++) {
                if (numArray[j - 1] > numArray[j])
                {
                    //SWAP THE ELEMENTS
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }

        }

    }
}
