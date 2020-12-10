package com.javamasterclass.controlflowstatements;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {
            int originalNumber = number;
            int lastDigit = number % 10;
            int count = 0;
            while (number != 0) {
                count++;
                number /= 10;
            }
            int divisor = (int) Math.pow(10, count - 1);
            int firstDigit = originalNumber / divisor;
            return firstDigit + lastDigit;
        }
    }
}
