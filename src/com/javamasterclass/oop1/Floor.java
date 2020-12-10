package com.javamasterclass.oop1;

public class Floor {
    private final double width;
    private final double length;

    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
