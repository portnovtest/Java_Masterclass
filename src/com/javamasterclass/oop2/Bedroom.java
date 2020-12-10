package com.javamasterclass.oop2;

public class Bedroom {
    private String name;
    private Wallz wall1;
    private Wallz wall2;
    private Wallz wall3;
    private Wallz wall4;
    private Ceiling ceiling;
    private Bedd bed;
    private Lamp lamp;

    public Bedroom(String name, Wallz wall1, Wallz wall2, Wallz wall3, Wallz wall4, Ceiling ceiling, Bedd bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
