package Advanced.Lesson2_MultidimensionalArrays.Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[matrixSize][matrixSize];

        fillMatrix(matrix, matrixSize,scanner);

       int sum1 = sumPrimaryDiagonal(matrix,matrixSize);

        int sum2 = sumSecondaryDiagonal(matrix,matrixSize);

        System.out.println(Math.abs(sum1 - sum2));
    }

    private static int sumSecondaryDiagonal(int[][] matrix, int matrixSize) {
        int sum = 0;
        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                if (col == matrixSize - row - 1){
                    sum+=matrix[row][col];

                }
            }
        }
        return sum;
    }

    private static int sumPrimaryDiagonal(int[][] matrix,int matrixSize) {
        int sum = 0;
        for (int row = 0; row < matrixSize ; row++) {
            for (int col = 0; col < matrixSize; col++) {
                if (row == col){
                    sum += matrix[row][col];

                }

            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, int matrixSize,Scanner scanner) {
        for (int row = 0; row < matrixSize; row++) {
            int [] rowMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowMatrix;

        }

    }
}
