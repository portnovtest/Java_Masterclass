package com.javamasterclass.controlflowstatements;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int greatestDivisor = 0;
        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                if ((first % i == 0) && (second % j == 0)) {
                    if ((i == j) && (i > greatestDivisor)) {
                        greatestDivisor = i;
                    }
                }
            }
        }
        return greatestDivisor;
    }
}
