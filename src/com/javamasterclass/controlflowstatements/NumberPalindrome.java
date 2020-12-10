package com.javamasterclass.controlflowstatements;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (Math.abs(number) > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }
}
