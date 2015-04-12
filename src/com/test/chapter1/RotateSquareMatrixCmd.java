package com.test.chapter1;

import java.util.Scanner;

/**
 * Created by ss on 4/5/15.
 */
public class RotateSquareMatrixCmd {

    public static class RotateSquareMatrix {
        public static void rotate(int[][] matrix) {
            for (int i=0; i<matrix.length/2; i++) {
                int last = matrix.length - i - 1;
                for (int j = i; j < last; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[last + i - j][i];
                    matrix[last + i - j][i] = matrix[last][last + i - j];
                    matrix[last][last + i - j] = matrix[j][last];
                    matrix[j][last] = temp;
                }
            }
        }

        public static void print(int[][] matrix) {
            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix[i].length; j++) {
                    System.out.print(matrix[i][j]);
                    if (j<matrix[i].length-1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter N (number of rows in square matrix): ");
        Scanner keyboard = new Scanner(System.in);
        int rows = keyboard.nextInt();
        System.out.println("Size = [" + rows + "x" + rows + "]");
        int[][] matrix = new int[rows][rows];
        int val = 10;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<rows; j++) {
                val++;
                matrix[i][j] = val;
            }
        }
        System.out.println("\nOriginal Matrix");
        RotateSquareMatrix.print(matrix);
        RotateSquareMatrix.rotate(matrix);
        System.out.println("\nRotated Matrix");
        RotateSquareMatrix.print(matrix);

    }
}
