package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2},
                {3, 4, 5, 6}
        };
        String res = getNumberUnderDiagonal(matrix);
        System.out.println(res);
    }
    public int[] getDiagonal(int[][] matrix) {
        if (matrix.length == 0) {
            return null;
        }
        int returned[] = new int[matrix.length];
        for (int i = 0; i < returned.length; i++) {
            returned[i] = matrix[i][i];
        }
        return returned;

    }

    public int[] getCounterDiagonal(int[][] matrix) {
        if (matrix.length == 0) {
            return null;
        }
        int matrix1[] = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            matrix1[i] += matrix[i][matrix1.length - i - 1];
        }
        return matrix1;

    }
    public static String  getNumberUnderDiagonal(int[][] matrix) {
        int k = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j){
                    builder.append(matrix[i][j]);
                }
            }
        }
        return builder.toString();
    }
}

