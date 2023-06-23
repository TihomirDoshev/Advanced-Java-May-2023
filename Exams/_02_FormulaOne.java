package Advanced.Exams;

import java.util.Scanner;

public class _02_FormulaOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int numCommands = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        int markerRow = -1;
        int markerCol = -1;


        for (int row = 0; row < size; row++) {
            char[] matrixRow = scanner.nextLine().toCharArray();
            matrix[row] = matrixRow;

        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 'P') {
                    markerRow = row;
                    markerCol = col;
                }

            }
        }
        for (int i = 0; i < numCommands; i++) {

            matrix[markerRow][markerCol] = '.';

            String command = scanner.nextLine();

            switch (command) {
                //up, down, left or right
                case "up":
                    markerRow--;
                    if (markerRow < 0) {
                        markerRow = size - 1;
                    }
                    break;
                case "down":
                    markerRow++;
                    if (markerRow >= size) {
                        markerRow = 0;
                    }
                    break;
                case "left":
                    markerCol--;
                    if (markerCol < 0) {
                        markerCol = size - 1;
                    }
                    break;
                case "right":
                    markerCol++;
                    if (markerCol >= size) {
                        markerCol = 0;
                    }
                    break;

            }


            if (matrix[markerRow][markerCol] == 'B') {
                switch (command) {
                    case "up":
                        markerRow--;
                        if (markerRow < 0) {
                            markerRow = size - 1;
                        }
                        break;
                    case "down":
                        markerRow++;
                        if (markerRow >= size) {
                            markerRow = 0;
                        }
                        break;
                    case "left":
                        markerCol--;
                        if (markerCol < 0) {
                            markerCol = size - 1;
                        }
                        break;
                    case "right":
                        markerCol++;
                        if (markerCol >= size) {
                            markerCol = 0;
                        }
                        break;


                }

            } else if (matrix[markerRow][markerCol] == 'T') {
                switch (command) {
                    case "up":
                        markerRow++;

                        break;
                    case "down":
                        markerRow--;
                        if (markerRow >= size) {
                            markerRow = 0;
                        }
                        break;
                    case "left":
                        markerCol++;

                        break;
                    case "right":
                        markerCol--;
                        if (markerCol >= size) {
                            markerCol = 0;
                        }
                        break;


                }


            } else if (matrix[markerRow][markerCol] == 'F') {
                System.out.println("Well done, the player won first place!");
                matrix[markerRow][markerCol] = 'P';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                return;
            }
            matrix[markerRow][markerCol] = 'P';
        }
        System.out.println("Oh no, the player got lost on the track!");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }


    }

}

