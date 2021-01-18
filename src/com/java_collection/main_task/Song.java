package com.java_collection.main_task;

import com.java_collection.main_task.style.StyleOfSong;

public class Song  {
    private String nameOfSound;
    private String nameOfAuthor;
    private double duration;
    private StyleOfSong style;

    public StyleOfSong getStyle() {
        return style;
    }

   public Song(String nameOfSound, String nameOfAuthor, double duration, StyleOfSong style){
        this.nameOfSound  = nameOfSound;
        this.nameOfAuthor = nameOfAuthor;
        this.duration = duration;
        this.style = style;

    }
    public double getDuration(){
        return duration;
    }

    @Override
    public String toString (){
        return "|Name: " + nameOfSound + ", " +
                " Author: " + nameOfAuthor + ", " +
                " Duration: " + duration + ", " +
                " Style: " + style;
    }

//
}
