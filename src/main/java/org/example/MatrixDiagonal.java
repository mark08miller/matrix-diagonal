package org.example;

public class MatrixDiagonal {
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
}