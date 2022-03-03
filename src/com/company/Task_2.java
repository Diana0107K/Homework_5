package com.company;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("numberOfRows1 = ");
        int numberOfRows1 = in.nextInt();
        System.out.print("numberOfColumns1 = ");
        int numberOfColumns1 = in.nextInt();
        System.out.print("numberOfColumns2 = ");
        int numberOfColumns2 = in.nextInt();
        int[][] matrix1 = new int[numberOfRows1][numberOfColumns1];
        int[][] matrix2 = new int[numberOfColumns1][numberOfColumns2];
        int[][] matrixProd = new int[numberOfRows1][numberOfColumns2];
        System.out.println("Fill in the matrix1");
        matrix1 = fillMatrix(matrix1);
        outputMatrix(matrix1);
        System.out.println("Fill in the matrix2");
        matrix2 = fillMatrix(matrix2);
        outputMatrix(matrix2);
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                for (int l = 0; l < matrix2.length; l++) {
                    matrixProd[i][j] += matrix1[i][l] * matrix2[l][j];
                }
            }
        }
        System.out.println("Matrix multiplication");
        outputMatrix(matrixProd);
    }

    static int[][] fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Scanner inn = new Scanner(System.in);
                matrix[i][j] = inn.nextInt();
            }
        }
        return matrix;
    }

    static void outputMatrix(int[][] matrix) {
        for (int[] subArray : matrix) {
            for (int element : subArray) {
                System.out.print(element + "  ");
            }
            System.out.println("");
        }
    }
}
