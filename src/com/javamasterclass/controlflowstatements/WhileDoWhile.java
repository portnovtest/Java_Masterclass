package com.javamasterclass.controlflowstatements;

public class WhileDoWhile {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("***************************");
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }
        System.out.println("***************************");
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("***************************");
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        int sumEven = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }

        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
