package Advanced.Exams;

import java.util.Scanner;

public class _02_Selling {
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
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 'S') {
                    markerRow = row;
                    markerCol = col;

                }
            }
        }
        while (true) {
            String command = scanner.nextLine();
            //"up", "down", "left", "right"
            matrix[markerRow][markerCol] = '-';
            switch (command) {
                case "up":
                    markerRow --;
                    break;
                case "down":
                    markerRow ++ ;
                    break;
                case "left":
                    markerCol -- ;
                    break;
                case "right":
                    markerCol ++ ;
                    break;
            }
            if (markerRow < 0 || markerRow >= size || markerCol < 0 || markerCol >= size){
                System.out.println("Bad news, you are out of the bakery.");
                System.out.printf("Money: %d%n",money);
                break;

            }
            if (Character.isDigit(matrix[markerRow][markerCol])){
                money+=Integer.parseInt(matrix[markerRow][markerCol]+"");
                if (money>=50){
                    System.out.println("Good news! You succeeded in collecting enough money!");
                    System.out.printf("Money: %d%n",money);
                    matrix[markerRow][markerCol] = 'S';
                    break;
                }
            }else if (matrix[markerRow][markerCol] == 'O'){
                matrix[markerRow][markerCol] = '-';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (matrix[row][col] == 'O'){
                            markerRow = row;
                            markerCol = col;


                        }
                    }
                }
            }

            matrix[markerRow][markerCol] = 'S';


        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }


    }

}
