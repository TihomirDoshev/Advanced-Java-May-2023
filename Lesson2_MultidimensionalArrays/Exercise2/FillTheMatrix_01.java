package Advanced.Lesson2_MultidimensionalArrays.Exercise2;

import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        String [] info = scanner.nextLine().split(",\\s+");
        int matrixSize = Integer.parseInt(info[0]);
        String type = info[1];

        int [][]matrix = new int[matrixSize][matrixSize];


        switch (type){
            case "A":
                int startNumber = 1;
                for (int col = 0; col <matrixSize; col++) {
                    for (int row = 0; row < matrixSize; row++) {
                        matrix[row][col] = startNumber;
                        startNumber++;

                    }

                }
                break;
            case "B":
                fillMatrix(matrix);
                break;
        }
        printMatrix(matrix);
    }

    private static void fillMatrix(int[][] matrix) {
        int startNum = 1;
        for (int col = 0; col < matrix.length; col++) {
            if ((col + 1) % 2 == 0){
                for (int row = matrix.length - 1; row >= 0 ; row--) {
                    matrix[row][col] = startNum;
                    startNum++;

                }
            }else {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = startNum;
                    startNum++;

                }
            }

        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]+" ");

            }
            System.out.println();

        }
    }
}
