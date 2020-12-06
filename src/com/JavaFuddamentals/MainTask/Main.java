package com.JavaFuddamentals.MainTask;

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



    }
}
