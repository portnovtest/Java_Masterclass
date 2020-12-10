package com.javamasterclass.controlflowstatements;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }

        while (firstNumber > 0) {
            int firstDigit = firstNumber % 10;
            if ((firstDigit == secondNumber % 10) || (firstDigit == (secondNumber /= 10) % 10)) {
                return true;
            }
            firstNumber /= 10;
        }
        return false;
    }
}

