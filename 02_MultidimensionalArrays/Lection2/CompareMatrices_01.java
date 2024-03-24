package Advanced.Lesson2_MultidimensionalArrays.Lection2;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String [] matrixSize = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        int[][] matrix1 = new int [rows][cols];
        int[][] matrix2 = new int [rows][cols];

        for (int row = 0; row < rows; row++) {
            int [] rowMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix1[row] = rowMatrix;
        }
        String [] matrix2Size = scanner.nextLine().split("\\s+");

        int rows2 = Integer.parseInt(matrix2Size[0]);
        int cols2 = Integer.parseInt(matrix2Size[1]);

        if (rows != rows2 || cols != cols2){
            System.out.println("not equal");
            return;

        }
        for (int row = 0; row < rows2; row++) {
            String [] rowMatrix = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols2; col++) {
                matrix2[row][col] = Integer.parseInt(rowMatrix[col]);

            }

        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix1[row][col] != matrix2[row][col]) {
                    System.out.println("not equal");
                    return;


                }

            }
        }
        System.out.println("equal");


        }


    }

