package Advanced.Exams;

import java.util.Scanner;

public class _02_Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",\\s+");
        char[][] matrix = new char[size][size];

        int markerRow = -1;
        int markerCol = -1;
        int snakeSize = 1;
        int countOfFood = 0;

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
                if (matrix[row][col] == 'f') {
                    countOfFood++;
                }
            }

        }

        for (int i = 0; i < commands.length; i++) {
            String currentCommand = commands[i];
            matrix[markerRow][markerCol] = '*';
            switch (currentCommand) {
                //  "left"  , "right"  , "up"  , "down"  .
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
            if (matrix[markerRow][markerCol] == 'e') {
                System.out.println("You lose! Killed by an enemy!");
                return;
            } else if (matrix[markerRow][markerCol] == 'f') {
                snakeSize++;
                countOfFood--;
                if (countOfFood == 0) {
                    System.out.printf("You win! Final python length is %d", snakeSize);
                    return;
                }

            }
            matrix[markerRow][markerCol] = 's';



            }
        System.out.printf("You lose! There is still %d food to be eaten.", countOfFood);



        }
    }

