package com.javamasterclass.controlflowstatements;

public class TheForStatement {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("******************************");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("******************************");

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Found number: " + i);
                if (count == 10) {
                    System.out.println("Exiting the loop");
                    break;
                }
            }

        }

        System.out.println("******************************");
        int count2 = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count2++;
                sum += i;
                System.out.println("Found number: " + i);
            }
            if (count2 == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
