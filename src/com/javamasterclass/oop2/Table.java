package com.javamasterclass.oop2;

public class Table {
    private final String type;
    private final int numberOfLegs;
    private boolean isCleared;

    public Table(String type, int numberOfLegs, boolean isCleared) {
        this.type = type;
        this.numberOfLegs = numberOfLegs;
        this.isCleared = isCleared;
    }

    public void clearTable() {
        isCleared = true;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean isCleared() {
        return isCleared;
    }
}
