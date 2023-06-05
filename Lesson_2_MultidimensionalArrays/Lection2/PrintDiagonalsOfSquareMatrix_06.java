package Advanced.Lesson2_MultidimensionalArrays.Lection2;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[matrixSize][];

        for (int row = 0; row < matrixSize; row++) {
            int[] rowsMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowsMatrix;

        }
        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                if (row == col) {
                    System.out.print(matrix[row][col] + " ");

                }

            }


        }
        System.out.println();

            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[matrix.length - 1 - col][col] + " ");

                }


            }

        }
