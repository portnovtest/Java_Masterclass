package com.javamasterclass.oop2;

public class Room {
    private String name;
    private Windows window;
    private Door door;
    private Bed bed;
    private Table table;

    public Room(String name, Windows window, Door door, Bed bed, Table table) {
        this.name = name;
        this.window = window;
        this.door = door;
        this.bed = bed;
        this.table = table;
    }

    public void openTheDoor() {
        door.openDoor();
    }

    public String getName() {
        return name;
    }

    public Windows getWindow() {
        return window;
    }

    public Bed getBed() {
        return bed;
    }

    public Table getTable() {
        return table;
    }
}
