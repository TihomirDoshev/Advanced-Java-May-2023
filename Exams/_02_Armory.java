package Advanced.Exams;

import java.util.Scanner;

public class _02_Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];

        int rowA = -1;
        int colA = -1;
        int swords = 0;

        for (int row = 0; row < size; row++) {
            String input = scanner.nextLine();
            char[] matrixRow = input.toCharArray();
            matrix[row] = matrixRow;

        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 'A') {
                    rowA = row;
                    colA = col;
                }
            }
        }
        String direction = scanner.nextLine();
        while (swords <= 65) {
            matrix[rowA][colA] = '-';
            //"up", "down", "left", "right"
            switch (direction) {
                case "up":
                    rowA--;
                    break;
                case "down":
                    rowA++;
                    break;
                case "left":
                    colA--;
                    break;
                case "right":
                    colA++;
                    break;
            }
            if (rowA < 0 || rowA >= size || colA < 0 || colA >= size) {
                System.out.println("I do not need more swords!");
                System.out.printf("The king paid %d gold coins.%n", swords);
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }

                return;

            }
            if (Character.isDigit(matrix[rowA][colA])) {
                int currentSword = Integer.parseInt(matrix[rowA][colA] + "");
                swords = swords + currentSword;
            } else if (matrix[rowA][colA] == 'M') {
                matrix[rowA][colA] = '-';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (matrix[row][col] == 'M') {
                            rowA = row;
                            colA = col;
                        }

                    }
                }


            }
            matrix[rowA][colA] = 'A';

            if (swords >= 65){
                continue;
            }
            direction = scanner.nextLine();


        }

            System.out.println("Very nice swords, I will come back for more!");
            System.out.printf("The king paid %d gold coins.%n", swords);

            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }


        }




    }

