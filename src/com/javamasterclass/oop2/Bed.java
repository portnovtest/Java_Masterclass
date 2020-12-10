package com.javamasterclass.oop2;

public class Bed {
    private final String type;
    private final double width;
    private final double length;
    private final double height;

    public Bed(String type, double width, double length, double height) {
        this.type = type;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
