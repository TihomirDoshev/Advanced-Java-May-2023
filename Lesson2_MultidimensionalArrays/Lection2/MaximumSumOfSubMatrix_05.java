package Advanced.Lesson2_MultidimensionalArrays.Lection2;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOfSubMatrix_05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = array;
        }
        int maxSum = Integer.MIN_VALUE;
        int[][] result = new int[2][2];
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {

                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (maxSum < sum) {
                    maxSum = sum;

                    result = new int[][]{
                            {matrix[row][col], matrix[row][col + 1]},
                            {matrix[row + 1][col], matrix[row + 1][col + 1]}

                    };


                }
            }

        }
        printMatrix(result);
        System.out.println(maxSum);
    }
    private static void printMatrix (int [][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }


    }
}

