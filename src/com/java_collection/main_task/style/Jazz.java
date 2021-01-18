package com.java_collection.main_task.style;

import com.java_collection.main_task.Song;

public class Jazz extends Song {

    private int birthdayAuthor;
    public Jazz(String nameOfSound, String nameOfAuthor, double duration, StyleOfSong style, int birthdayAuthor) {
        super(nameOfSound, nameOfAuthor, duration, style);
        this.birthdayAuthor = birthdayAuthor;
    }
    @Override
    public String toString(){
        return super.toString() + ", " + "Author's birthday: " + birthdayAuthor + " |";
    }
}
