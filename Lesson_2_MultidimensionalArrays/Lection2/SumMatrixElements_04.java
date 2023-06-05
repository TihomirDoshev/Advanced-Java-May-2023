package Advanced.Lesson2_MultidimensionalArrays.Lection2;

import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String [] info = scanner.nextLine().split(",\\s+");
        int rows = Integer.parseInt(info[0]);
        int cols = Integer.parseInt(info[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String [] rowOfMatrix = scanner.nextLine().split(",\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col]=Integer.parseInt(rowOfMatrix[col]);

            }

        }
        int sum = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                sum = sum + matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);







    }
}
