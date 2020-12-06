package com.JavaFuddamentals.MainTask;

import com.sun.source.doctree.ThrowsTree;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        for (int i = args.length -1; i>=0; i--) {  //Аргументы командной строки в обрятном порядке
            System.out.print(args[i]);
        }
        System.out.println("\n");

        // Вывод аргументов командной строки  в консоль их сумма и произведение
        int amount = 0;
        int prod = 1;
        for (int i = 0; i < args.length; i  ++) {
            System.out.println(args[i]);
            int newargs = Integer.parseInt(args[i]);
            amount += newargs;
            prod *= newargs;
        }
        System.out.println("Amount = " + amount + "\n" + "Product = " + prod);

        //Приветствие пользователя при вводе через консоль
        Scanner in = new Scanner (System.in);
        System.out.print("Enter you name: ");
        String name = in.next();
        System.out.println("Hello, " + name);

        //Вывод заданного количества чисел
        System.out.print("какое количество чисел вывести?: ");
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

        //Выводит на консоль месяц соответствующий введенному числу
        System.out.print("Введите число от 1 до 12: ");
        int month = in.nextInt();
        switch (month) {
            case 1 -> System.out.println("1 this is January");
            case 2 -> System.out.println("2 this is February");
            case 3 -> System.out.println("3 this is March");
            case 4 -> System.out.println("4 this is April");
            case 5 -> System.out.println("5  this is May");
            case 6 -> System.out.println("6 this is June");
            case 7 -> System.out.println("7 this is July");
            case 8 -> System.out.println("8 this is August");
            case 9 -> System.out.println("9 this is September");
            case 10 -> System.out.println("10 this is October");
            case 11 -> System.out.println("11 this is November");
            case 12 -> System.out.println("12 this is December");
            default -> throw new RuntimeException("You need enter from 1 to 12");
        }
    }
}
