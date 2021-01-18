package com.java_collection.main_task;

import java.util.Comparator;

public class SongStyleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getStyle().compareTo(o2.getStyle());
    }
}
