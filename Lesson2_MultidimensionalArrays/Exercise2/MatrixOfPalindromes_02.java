package Advanced.Lesson2_MultidimensionalArrays.Exercise2;

import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        String [] matrixSize = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);
        String [][] matrix = new String [rows][cols];

        char startLetter = 'a';
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String currentWord = "" + startLetter + (char) (startLetter + col )+ startLetter;
                matrix[row][col] = currentWord;
            }
            startLetter = (char) (startLetter + 1);

        }
        printMatrix(matrix,rows,cols);


    }

    private static void printMatrix(String[][] matrix,int rows,int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]+" ");

            }
            System.out.println();

        }
    }
}
