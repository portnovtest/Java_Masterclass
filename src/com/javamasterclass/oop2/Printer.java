package com.javamasterclass.oop2;

public class Printer {

    private int tonerLevel;
    private int numberOfPages;
    private final boolean isDuplex;

    public Printer(int tonerLevel) {
        this.tonerLevel = tonerLevel;
        this.numberOfPages = 0;
        this.isDuplex = false;
    }

    public void fillUpToner(int tonerLevel) {
        if (this.tonerLevel + tonerLevel > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel += tonerLevel;
        }
    }

    public void printPages(int numberOfPages, boolean isDuplex) {
        if (this.tonerLevel <= 0) {
            System.out.println("Printer is out of toner");
        } else {
            if (isDuplex) {
                if (numberOfPages % 2 > 0) {
                    this.numberOfPages = (numberOfPages / 2) + 1;
                } else {
                    this.numberOfPages = numberOfPages / 2;
                }

            } else {
                this.numberOfPages = numberOfPages;
            }
            System.out.println("Printing " + getNumberOfPages() + " pages");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
