package com.javamasterclass.controlflowstatements;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber < 10 || firstNumber > 1000) || (secondNumber < 10 || secondNumber > 1000) || (thirdNumber < 10 || thirdNumber > 1000)) {
            return false;
        }
        int firstDigit = firstNumber % 10;
        int secondDigit = secondNumber % 10;
        int thirdDigit = thirdNumber % 10;
        return (firstDigit == secondDigit) || (firstDigit == thirdDigit) || (secondDigit == thirdDigit);
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}


