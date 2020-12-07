package com.JavaFuddamentals.OptionalTask;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Какое количество чисел хотите ввести? -  ");
        int count = in.nextInt();
        System.out.println("Вводите заданное количество чисел :");
        String [] array = new String [count];
        for (int i = 0; i < count; i++) {
          array[i] = in.next();
        }
        //Минимальное и максимальное число и их длина
        int min = 20;
        int max = 0;
        String minStr = null;
        String maxStr = null;
        for (String elem: array){
            if(elem.length() < min){
                min = elem.length();
                minStr = elem;
            }
            if (elem.length() > max){
                max = elem.length();
                maxStr = elem;
            }

        }
        System.out.println("Минимальное число: " + minStr + " состоит из: " + min + " цифр");
        System.out.println("Максимальное число: " + maxStr + " состоит из: " + max + " цифр");


    }
}