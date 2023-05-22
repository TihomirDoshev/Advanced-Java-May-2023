package Advanced.Lesson2_MultidimensionalArrays.Exercise2;

import java.util.Scanner;

public class MaximalSum_04 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        String [] matrixSize = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        int [][] matrix = new int[rows][cols];


        for (int row = 0; row < rows; row++) {
            String [] rowMatrix = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rowMatrix[col]);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1 ] + matrix[row][col + 2]+
                        matrix[row + 1 ][col] + matrix[row + 1][col + 1] + matrix[row +1][col + 2]+
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (sum > maxSum){
                    maxSum = sum;
                    startRow = row;
                    startCol = col;
                }

            }
        }
        System.out.println("Sum = "+ maxSum);
        for (int row = startRow; row < startRow + 3 ; row++) {
            for (int col = startCol; col <startCol + 3; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();

        }


    }
}
