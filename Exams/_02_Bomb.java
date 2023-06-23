package Advanced.Exams;

import java.util.Scanner;

public class _02_Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split(",");
        char[][] matrix = new char[size][size];

        int markerRow = -1;
        int markerCol = -1;
        int countOfBombs = 0;
        int allBombs = 0;


        for (int row = 0; row < size; row++) {
            char[] matrixRow = scanner.nextLine().replace(" ", "").toCharArray();
            matrix[row] = matrixRow;
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 's') {
                    markerRow = row;
                    markerCol = col;

                }
            }
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 'B') {
                    allBombs++;
                }
            }
        }
        for (int i = 0; i < input.length; i++) {
            matrix[markerRow][markerCol] = '+';
            String command = input[i];
            switch (command) {
                case "up":
                    markerRow--;
                    if (markerRow < 0) {
                        markerRow++;
                    }
                    break;
                case "down":
                    markerRow++;
                    if (markerRow >= size) {
                        markerRow--;
                    }
                    break;
                case "left":
                    markerCol--;
                    if (markerCol < 0) {
                        markerCol++;
                    }
                    break;
                case "right":
                    markerCol++;
                    if (markerCol >= size) {
                        markerCol--;
                    }
                    break;
            }
            if (matrix[markerRow][markerCol] == 'B') {
                countOfBombs++;
                System.out.println("You found a bomb!");
                if (countOfBombs == allBombs) {
                    System.out.println("Congratulations! You found all bombs!");
                    return;
                }

            } else if (matrix[markerRow][markerCol] == 'e') {
                System.out.printf("END! %d bombs left on the field", allBombs - countOfBombs);
                return;

            }
            matrix[markerRow][markerCol] = 's';

        }
        //"{bombs left} bombs left on the field. Sapper position: ({row},{col})"
        System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", allBombs - countOfBombs, markerRow, markerCol);


    }
}