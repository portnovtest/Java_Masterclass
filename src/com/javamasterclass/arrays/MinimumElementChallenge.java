package com.javamasterclass.arrays;

import java.util.Scanner;

public class MinimumElementChallenge {

//    private static int[] readIntegers(int capacity) {
//        int[] userArray = new int[capacity];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number : \r");
//        for (int i = 0; i < userArray.length; i++) {
//            userArray[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(userArray));
//        return userArray;
//    }
//
//    private static int findMin(int[] array) {
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        return min;
//    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println(findMin(readIntegers(5)));
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
