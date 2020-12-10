package com.javamasterclass.controlflowstatements;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int counter = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                average = (Math.round((double) sum / counter));
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + (int) average);
        scanner.close();
    }
}
