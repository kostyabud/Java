package com.java_collection.main_task.style;

import com.java_collection.main_task.Song;

public class Classic extends Song {
    private int yearOfWriting;
    public Classic(String nameOfSound, String nameOfAuthor, double duration, StyleOfSong style, int yearOfWriting) {
        super(nameOfSound, nameOfAuthor, duration, style);
        this.yearOfWriting = yearOfWriting;

    }
    @Override
    public String toString(){
        return super.toString() + ", " + "Year of writing: " + yearOfWriting + " |";
    }



}
