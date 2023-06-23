package Advanced.Exams;

import java.util.Arrays;
import java.util.Scanner;

public class _02_BlindManBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = num[0];
        int cols = num[1];
        char [][] matrix = new char[rows][cols];
        int markerRow = -1;
        int markerCol = -1;
        int moves = 0;
        int people = 0;

        for (int row = 0; row < rows; row++) {
            char [] matrixRow = scanner.nextLine().replace(" ","").toCharArray();
            matrix[row] = matrixRow;
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 'B'){
                    markerRow = row;
                    markerCol = col;

                }
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
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
            if (markerRow < 0 || markerRow >= rows || markerCol < 0 || markerCol >= cols){
                moves--;
                if (command.equals("left")) {
                    markerCol++;
                } else if (command.equals("right")) {
                    markerCol--;

                } else if (command.equals("down")) {
                    markerRow--;

                } else if (command.equals("up")) {
                    markerRow++;


                }
            }else if (matrix[markerRow][markerCol] == 'O'){
                moves--;
                if (command.equals("left")) {
                    markerCol++;
                } else if (command.equals("right")) {
                    markerCol--;

                } else if (command.equals("down")) {
                    markerRow--;

                } else if (command.equals("up")) {
                    markerRow++;


                }
            }
            if (matrix[markerRow][markerCol] == 'P'){
                people++;
                moves++;
            }
            if (matrix[markerRow][markerCol] == '-')
               moves ++;

                matrix[markerRow][markerCol] = 'B';






            if (people == 3){
                System.out.println("Game over!");
                System.out.printf("Touched opponents: %d Moves made: %d",people,moves);
                return;
            }

            command = scanner.nextLine();

        }
        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d",people,moves);



    }
}
