package com.javamasterclass.arrays.linkedlist;

public class Song {
    private final String title;
    private final double duration;

    public Song(String songName, double duration) {
        this.title = songName;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
