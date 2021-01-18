package com.java_collection.main_task.style;

import com.java_collection.main_task.Song;

public class Rock extends Song {
    private boolean authorIsAlive;
     public Rock(String nameOfSound, String nameOfAuthor, double duration, StyleOfSong style, boolean authorIsAlive ) {
        super(nameOfSound, nameOfAuthor, duration, style);
        this.authorIsAlive = authorIsAlive;

    }

    @Override
    public String toString(){
        return super.toString() + ", " + "Author is Alive: " + authorIsAlive + " |";
    }

}
