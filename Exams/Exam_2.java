package Advanced.Exams;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int [] num = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int rows = num[0];
        int cols = num[1];


        char[][] matrix = new char[rows][cols];

        int markerRow = -1;
        int markerCol = -1;
        int countCheese = 0;


        for (int row = 0; row < rows; row++) {
            char[] matrixRow = scanner.nextLine().toCharArray();
            matrix[row] = matrixRow;

        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 'M') {
                    markerRow = row;
                    markerCol = col;

                }else if (matrix[row][col] == 'C'){
                    countCheese ++;
                }
            }
        }
        System.out.println();


        String command = scanner.nextLine();
        //"up", "down", "left", "right", "End".
        while (!command.equals("danger")) {
            matrix[markerRow][markerCol] = '*';
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
            if (markerRow < 0 || markerRow >= rows || markerCol < 0 || markerCol >= cols) {
                switch (command) {
                    //"up", "down", "left", "right".
                    case "up":
                        markerRow++;
                        break;
                    case "down":
                        markerRow--;
                        break;
                    case "left":
                        markerCol++;
                        break;
                    case "right":
                        markerCol--;
                        break;
                }
                matrix[markerRow][markerCol] = 'M';
                System.out.println("No more cheese for tonight!");
                matrix[markerRow][markerCol] = 'M';
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);

                    }
                    System.out.println();
                }

                return;
            }
            if (matrix[markerRow][markerCol] == 'C'){
                countCheese --;
                if (countCheese == 0){
                    System.out.println("Happy mouse! All the cheese is eaten, good night!");
                    matrix[markerRow][markerCol] = 'M';
                    for (int row = 0; row < rows; row++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.print(matrix[row][col]);

                        }
                        System.out.println();
                    }
                    return;
                }
            }else if (matrix[markerRow][markerCol] == '@') {
                switch (command) {
                    //"up", "down", "left", "right".
                    case "up":
                        markerRow++;
                        break;
                    case "down":
                        markerRow--;
                        break;
                    case "left":
                        markerCol++;
                        break;
                    case "right":
                        markerCol--;
                        break;
                }



            }else if (matrix[markerRow][markerCol] == 'T'){
                System.out.println("Mouse is trapped!");
                matrix[markerRow][markerCol] = 'M';
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);

                    }
                    System.out.println();
                }
                return;


            }

            matrix[markerRow][markerCol] = 'M';
            command = scanner.nextLine();

        }
        System.out.println("Mouse will come back later!");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]);

            }
            System.out.println();
        }

    }
}
