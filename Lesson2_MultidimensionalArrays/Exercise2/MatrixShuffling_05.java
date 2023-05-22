package Advanced.Lesson2_MultidimensionalArrays.Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[][] matrix = new String[size[0]][size[1]];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = scanner.nextLine().split("\\s+");
        }

        String commands = scanner.nextLine();

        while (!commands.equals("END")){
            String[] commandsArr = commands.split("\\s+");

            if (commandsArr[0].equals("swap") && commandsArr.length == 5){
                int row1 = Integer.parseInt(commandsArr[1]);
                int col1 = Integer.parseInt(commandsArr[2]);
                int row2 = Integer.parseInt(commandsArr[3]);
                int col2 = Integer.parseInt(commandsArr[4]);

                if (row1 > matrix.length || col1 > matrix.length
                        || row2 > matrix.length || col2 > matrix.length){
                    System.out.println("Invalid input!");
                    commands = scanner.nextLine();
                    continue;
                }

                String oldNumber = String.valueOf(matrix[row1][col1]);
                String newNumber = String.valueOf(matrix[row2][col2]);

                matrix[row1][col1] = String.valueOf(newNumber);
                matrix[row2][col2] = String.valueOf(oldNumber);

                printMatrix(matrix);

            }else {
                System.out.println("Invalid input!");
            }

            commands = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}




