package Advanced.Exams;

import java.util.Scanner;

public class _02_PresentDelivery_83 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numPresents = Integer.parseInt(scanner.nextLine());
        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        int markerRow = -1;
        int markerCol = -1;
        int countGoodChild = 0;
        int totalGoodChild = 0;


        for (int row = 0; row < size; row++) {
            char[] matrixRow = scanner.nextLine().replace(" ","").toCharArray();
            matrix[row] = matrixRow;

        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 'S') {
                    markerRow = row;
                    markerCol = col;
                }else if (matrix[row][col] == 'V'){
                    countGoodChild ++;
                    totalGoodChild ++;

                }

            }
        }
        String command = scanner.nextLine();
        while (!command.equals("Christmas morning")){
            matrix[markerRow][markerCol] = '-';
            switch(command) {
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
            if (matrix[markerRow][markerCol] == 'V'){
                countGoodChild --;
                numPresents --;
                if (numPresents == 0){
                    System.out.println("Santa ran out of presents!");
                    matrix[markerRow][markerCol] = 'S';
                    break;
                }


            }else if (matrix[markerRow][markerCol] == 'C'){
                int upPos = matrix[markerRow -1][markerCol];
                int downPos = matrix[markerRow +1][markerCol];
                int leftPos = matrix[markerRow][markerCol - 1];
                int rightPos = matrix[markerRow][markerCol + 1];

                if (upPos == 'V' || upPos == 'X'){
                    if (upPos == 'V'){
                        countGoodChild -- ;

                    }
                    numPresents -- ;
                    upPos = '-';

                }else if (downPos == 'V' || downPos == 'X'){
                    if (downPos == 'V'){
                        countGoodChild -- ;

                    }
                    numPresents -- ;
                    downPos = '-';

                }else if (leftPos == 'V' || leftPos == 'X'){
                    if (leftPos == 'V'){
                        countGoodChild -- ;

                    }
                    numPresents -- ;
                    leftPos = '-';

                }else if (rightPos == 'V' || rightPos == 'X'){
                    if (rightPos == 'V'){
                        countGoodChild -- ;

                    }
                    numPresents --;
                    rightPos = '-';
                }
                if (numPresents <= 0){
                    System.out.println("Santa ran out of presents!");
                    matrix[markerRow][markerCol] = 'S';
                    break;
                }

            }

            matrix[markerRow][markerCol] = 'S';




            command = scanner.nextLine();

        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        if (countGoodChild == 0){
            System.out.printf("Good job, Santa! %d happy nice kid/s.",totalGoodChild);
        }else {
            System.out.printf("No presents for %d nice kid/s.",countGoodChild);
        }


    }
}
