package Advanced.Exams;

import java.util.Scanner;

public class _02_Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        int markerRow = -1;
        int markerCol = -1;
        int count = 0;

        for (int row = 0; row < size; row++) {
            char[] matrixRow = scanner.nextLine().toCharArray();
            matrix[row] = matrixRow;

        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 'B') {
                    markerRow = row;
                    markerCol = col;

                }
            }
        }
        String command = scanner.nextLine();
        //"up", "down", "left", "right", "End".
        while (!command.equals("End")) {
            matrix[markerRow][markerCol] = '.';
            switch (command) {
                //"up", "down", "left", "right".
                case "up":
                    markerRow--;
                    break;
                case "down":
                    markerRow++;
                    break;
                case "left":
                    markerCol--;
                    break;
                case "right":
                    markerCol++;
                    break;
            }
            if (markerRow < 0 || markerRow >= size || markerCol < 0 || markerCol >= size) {
                System.out.println("The bee got lost!");
                break;

            }
            if (matrix[markerRow][markerCol] == 'O') {
                matrix[markerRow][markerCol] = '.';

                switch (command) {
                    //"up", "down", "left", "right".
                    case "up":
                        markerRow--;
                        break;
                    case "down":
                        markerRow++;
                        break;
                    case "left":
                        markerCol--;
                        break;
                    case "right":
                        markerCol++;
                        break;
                }

                if (markerRow < 0 || markerRow >= size || markerCol < 0 || markerCol >= size) {
                    System.out.println("The bee got lost!%n");

                    break;

                }else if (matrix[markerRow][markerCol] == 'f'){
                    count++;
                }


                } else if (matrix[markerRow][markerCol] == 'f') {
                    count++;

                }

            matrix[markerRow][markerCol] = 'B';

            command = scanner.nextLine();
        }
        if (count >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", count);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - count);
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);

            }
            System.out.println();
        }
    }
    }

