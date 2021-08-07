package com.codegym;

import java.util.Scanner;

public class Main {

    public static double[][] creatArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng dòng và cột trong mảng: ");
        int size = sc.nextInt();


        double array[][] = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Nhập vào phần tử thứ [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextDouble();
            }
        }
        return array;
    }

    public static void showArray(double array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("phần tử thứ [" + i + "][" + j + "]: " + array[i][j]);
            }
        }
    }

    public static double calculatorSumMatrix(double array[][]) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        double array[][] = creatArray();
        showArray(array);
        double sum = calculatorSumMatrix(array);
        System.out.println("Tổng các số của đường chéo chính là: " + sum);
    }
}
