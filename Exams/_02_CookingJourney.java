package Advanced.Exams;

import java.util.Scanner;

public class _02_CookingJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        int markerRow = -1;
        int markerCol = -1;
        int money = 0;

        for (int row = 0; row < size; row++) {
            char[] matrixRow = scanner.nextLine().toCharArray();
            matrix[row] = matrixRow;

        }
        for (int row = 0; row < size; row++) {
            for (int cow = 0; cow < size; cow++) {
                if (matrix[row][cow] == 'S') {
                    markerRow = row;
                    markerCol = cow;

                }
            }
        }
        while (money < 50) {
            String command = scanner.nextLine();
            matrix[markerRow][markerCol] = '-';
            switch (command) {
                case "up":
                    markerRow--;
                    break;
                case "down":
                    markerRow++;
                    break;
                case "right":
                    markerCol++;
                    break;
                case "left":
                    markerCol--;
                    break;

            }
            if (markerRow < 0 || markerRow >= size || markerCol < 0 || markerCol >= size){
                System.out.println("Bad news! You are out of the pastry shop.");
                System.out.printf("Money: %d%n",money);
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }

                return;
            }
            if (Character.isDigit(matrix[markerRow][markerCol])){
                int currentNum = Integer.parseInt(matrix[markerRow][markerCol]+"");
                money+=currentNum;
            }else if (matrix[markerRow][markerCol] == 'P'){
                matrix[markerRow][markerCol] = '-';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (matrix[row][col] == 'P'){
                            markerRow = row;
                            markerCol = col;
                        }
                    }
                }
            }

            matrix[markerRow][markerCol] = 'S';

//            if (money >= 50){
//                continue;
            }
        System.out.println("Good news! You succeeded in collecting enough money!");
        System.out.printf("Money: %d%n",money);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }






        }
    }

