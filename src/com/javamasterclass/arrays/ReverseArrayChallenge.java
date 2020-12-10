package com.javamasterclass.arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {

    private static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[(array.length - 1) - i] = array[i];
        }
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
    }
}
