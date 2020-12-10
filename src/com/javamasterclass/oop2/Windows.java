package com.javamasterclass.oop2;

public class Windows {
    private final double width;
    private final double height;
    private final String material;
    private boolean open;

    public void openWindow() {
        this.open = true;
    }

    public Windows(double width, double height, String material, boolean open) {
        this.width = width;
        this.height = height;
        this.material = material;
        this.open = open;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isOpen() {
        return open;
    }
}
