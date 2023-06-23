package Advanced.Exams;

import java.util.Scanner;

public class _02_TheSquirrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String input1 = scanner.nextLine();

        char[][] matrix = new char[size][size];

        int ratRow = -1;
        int ratCol = -1;
        int hazelnuts =0;

        for (int row = 0; row < size; row++) {
            String matrixRow = scanner.nextLine();
            char[] matrixRow1 = matrixRow.toCharArray();
            matrix[row] = matrixRow1;
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                char symbol = matrix[row][col];
                if (symbol == 's') {
                    ratRow = row;
                    ratCol = col;
                }
            }
        }
        String [] input = input1.split(", ");

        //"left", "right", "down", and "up"

        for (int i = 0; i < input.length; i++) {
            String currentCommand = input[i];
            matrix[ratRow][ratCol] = '*';
            switch (currentCommand){
                case "up" :
                    ratRow --;
                    break;
                case "down":
                    ratRow++;
                    break;
                case "left":
                    ratCol--;
                    break;
                case "right":
                    ratCol++;
                    break;

            }
            if (ratRow<0 || ratRow >= size || ratCol <0 || ratCol >=size){
                System.out.println("The squirrel is out of the field.");
                System.out.printf("Hazelnuts collected: %d%n",hazelnuts);
                return;
            }
            if (matrix[ratRow][ratCol] == 'h'){
                hazelnuts++;

            } else if (matrix[ratRow][ratCol] == 't') {
                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                System.out.printf("Hazelnuts collected: %d%n",hazelnuts);
                return;

            }
            matrix[ratRow][ratCol] = 's';


        }
        if (hazelnuts == 3){
            System.out.println("Good job! You have collected all hazelnuts!");
            System.out.printf("Hazelnuts collected: %d%n",hazelnuts);
        }else {
            System.out.println("There are more hazelnuts to collect.");
            System.out.printf("Hazelnuts collected: %d%n",hazelnuts);

        }


    }

}
