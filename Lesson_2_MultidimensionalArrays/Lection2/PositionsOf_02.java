package Advanced.Lesson2_MultidimensionalArrays.Lection2;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] rowOfMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowOfMatrix;

        }
        int num = Integer.parseInt(scanner.nextLine());
        boolean isFind = false;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == num) {
                    isFind = true;
                    System.out.println(row + " " + col);

                }

            }
        }
        if (!isFind){
            System.out.println("not found");
        }
    }
}
