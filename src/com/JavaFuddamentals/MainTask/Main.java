package com.JavaFuddamentals.MainTask;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        for (int i = args.length -1; i>=0; i--) {  //Аргументы командной строки в обрятном порядке
            System.out.println(args[i]);
        }
        Scanner in = new Scanner (System.in); //Приветствие пользователя при вводе через консоль
        System.out.print("Enter you name: ");
        String name = in.next();
        System.out.println("Hello, " + name);

        System.out.print("какое количество чисел вывести?: "); //Вывод заданного количества чисел
        int num = in.nextInt();
        int[] arr = new int [num];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {             // без прехода на новую строку
            arr[i] = random.nextInt(10000) - 1000;
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < arr.length; i++) {             //с переходом
            arr[i] = random.nextInt(10000) -1000;
            System.out.println(arr[i]);
        }


    }
}
