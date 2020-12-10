package com.javamasterclass.oop1;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        Point zero = new Point(0, 0);
        return Math.sqrt((zero.getX() - this.x) * (zero.getX() - this.x) + (zero.getY() - this.y) * (zero.getY() - this.y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point newPoint) {
        return Math.sqrt((newPoint.getX() - this.x) * (newPoint.getX() - this.x) + (newPoint.getY() - this.y) * (newPoint.getY() - this.y));
    }
}
