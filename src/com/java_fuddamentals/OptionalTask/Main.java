package com.java_fuddamentals.OptionalTask;

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

        // Вывод чисел ф порядке убывания их длины
        for (int i = array.length -1; i > 0  ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() < array[j+1].length()){
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
                
            }

        }
        System.out.println("Вывод в порядке убывания длинны чисел");
        for (String s : array) {
            System.out.println(s);
        }
        // Числа меньше средней длины
        double average = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].length();

        }
        average = sum / count;
        System.out.println("Средняя длина = "+ average);
        for (String s : array) {
            if (s.length() < average) {
                System.out.println(s + " - длина = " + s.length());
            }

        }

    }
}