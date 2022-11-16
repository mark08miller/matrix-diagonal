package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2}, {4, 5, 6}, {1, 1, 1}};
        int[] result = getDiagonal(matrix);
        System.out.println(Arrays.toString(result));
        /*
         0 1 2
         4 5 6
         1 1 1
         */

    }

    public static int[] getDiagonal(int[][] matrix) {
        int returned[] = new int[matrix.length];
        int count = 0;
        for (int i = 0; i < returned.length; i++) {
            for (int j = 0; i < matrix[i].length; i++) {
                returned[i] += matrix[count][i];
                count++;
                break;
            }

        }
        return returned;

    }
}