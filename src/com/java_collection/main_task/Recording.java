package com.java_collection.main_task;


import com.java_collection.main_task.style.Classic;
import com.java_collection.main_task.style.Jazz;
import com.java_collection.main_task.style.Rock;
import com.java_collection.main_task.style.StyleOfSong;

import java.util.ArrayList;


public class Recording {
    public static void main (String [] args) {
        ArrayList<Song> disk = new ArrayList<>();
        disk.add(new Jazz("Fever", "Sarah Vaughan", 2.46, StyleOfSong.JAZZ, 1924));
        disk.add(new Rock("Гореть", "Lumen", 3.30, StyleOfSong.ROCK, true));
        disk.add(new Classic("Moonlight Sonata", "Ludwig Van Beethoven", 6.65, StyleOfSong.CLASSIC, 1800));
        disk.add(new Rock("Paranoid", "Black Sabbath", 2.43, StyleOfSong.ROCK, false));
        disk.add(new Jazz("You Are My Sunshine", "Betty Carter ", 3.13, StyleOfSong.JAZZ, 1929));
        disk.add(new Classic("Summer", "Antonio Vivaldi", 10.13, StyleOfSong.CLASSIC, 1723));

        System.out.println("Заданный диапазон длинны треков от 3 до 7 минут");
        double diskDuration = 0;
        for (int i = 0; i < 5; i++) {
            diskDuration += disk.get(i).getDuration();
            if (disk.get(i).getDuration() > 3 && disk.get(i).getDuration() < 7) {
                System.out.println(disk.get(i));
            }
        }
        System.out.println("\n" + "Суммарная длина треков на диске = " + diskDuration);

      disk.sort(new SongStyleComparator());
      for (int i = 0; i < 6; i++) {
            System.out.println(disk.get(i));
        }


    }
}
