package com.JavaFuddamentals.OptionalTaskTwo;

import java.util.Scanner;

public class Main {
    private static void showMatrix(int[]... arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("%7d", anInt);
            }
            System.out.println();
        }
    }

//    private static void findMostValue (int [][] arr) {
//        int max = arr [0][0];
//        for (int[] ints : arr) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (max < ints[j]) {
//                    max = ints[j];
//                }
//            }
//        }
//        System.out.println("Максимальное значение в матрице: " + max);
    
    public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.print("Размерность матрицы. Введите перове значение: ");
            int valueOne = in.nextInt();
            System.out.print("Размерность матрицы. Введите второе значение: ");
            int valueTwo = in.nextInt();
            int[][] matrix = new int[valueOne][valueTwo];
            System.out.print("Диапазон матрицы. Минимальное значение: ");
            int min = in.nextInt();
            System.out.print("Диапазон матрицы. Максимальное значение: ");
            int max = in.nextInt();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * ((max - min) + 1)) + min;

                }
            }
            showMatrix(matrix);
            
            // Упорядочить строки  матрицы в порядке возрастания значений элементов k-го столбца
            System.out.print("Выбирайте столбец: ");
            int column = in.nextInt();

             for (int i = 0; i < matrix.length ; i++) {
                 for (int j = i+1; j < matrix.length; j++) {
                     if (matrix[i][column] > matrix[j][column]){
                         for (int k = 0; k < matrix.length; k++) {
                             int temp = matrix[i][k];
                             matrix[i][k] = matrix[j][k];
                             matrix[j][k] = temp;
                             
                         }
                     }
                     
                 }
             }

        showMatrix(matrix);

    }
}
