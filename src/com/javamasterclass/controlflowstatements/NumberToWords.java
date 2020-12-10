package com.javamasterclass.controlflowstatements;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedDigitCount = getDigitCount(number);
            int reversedNumber = reverse(number);
            for (int i = 0; i < reversedDigitCount; i++) {
                int digit = reversedNumber % 10;
                reversedNumber /= 10;
                switch (digit) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    default:
                        System.out.print("Nine ");

                }
            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (Math.abs(number) > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int digitCounter = 0;
            while (number > 0) {
                digitCounter++;
                number /= 10;
            }
            return digitCounter;
        }
    }
}
