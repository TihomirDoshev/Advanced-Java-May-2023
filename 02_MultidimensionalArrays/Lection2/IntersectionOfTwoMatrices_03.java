package Advanced.Lesson2_MultidimensionalArrays.Lection2;

import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrix1 = new char[rows][cols];
        char[][] matrix2 = new char[rows][cols];


        for (int row = 0; row < rows; row++) {
            String[] rowMatrix = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix1[row][col] = rowMatrix[col].charAt(0);
            }
        }
        for (int row = 0; row < rows; row++) {
            String[] rowMatrix = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix2[row][col] = rowMatrix[col].charAt(0);


            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix1[row][col] == matrix2[row][col]){
                    System.out.print(matrix1[row][col]+" ");
                }else {
                    System.out.print("* ");
                }

            }
            System.out.println();

        }
    }
}
