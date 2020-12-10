package com.javamasterclass.oop2;

public class Door {
    private boolean isOpen;
    private final double width;
    private final double height;

    public Door(boolean isOpen, double width, double height) {
        this.isOpen = isOpen;
        this.width = width;
        this.height = height;
    }

    public void openDoor() {
        this.isOpen = true;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
