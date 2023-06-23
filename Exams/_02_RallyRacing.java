package Advanced.Exams;

import java.util.Scanner;

public class _02_RallyRacing {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String numberOfCar = scanner.nextLine();

        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            char[] matrixRow = scanner.nextLine().replace(" ","").toCharArray();
            matrix[row] = matrixRow;

        }
        System.out.println();

        int carRow = 0;
        int carCol = 0;
        int km = 0;

        matrix[carRow][carCol] = 'C';

        String command = scanner.nextLine();
        while (!command.equals("End")){
            matrix[carRow][carCol] = '.';
            //•	left
            //•	right
            //•	up
            //•	down
            switch (command){
                case "up":
                    carRow -- ;
                    break;
                case "down":
                    carRow ++;
                    break;
                case "left":
                    carCol --;
                    break;
                case "right":
                    carCol ++;
                    break;
            }

            if (matrix[carRow][carCol] == 'F'){
                matrix[carRow][carCol] = 'C';
                km +=10;

                System.out.printf("Racing car %s finished the stage!%n",numberOfCar);

                System.out.printf("Distance covered %d km.%n",km);
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        System.out.print(matrix[row][col]);

                    }
                    System.out.println();
                }
                return;
            }
            if (matrix[carRow][carCol] == 'T'){
                matrix[carRow][carCol] = '.';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (matrix[row][col] == 'T'){
                            carRow = row;
                            carCol = col;
                            km+=20;
                        }
                    }
                }

            }

            matrix[carRow][carCol] = 'C';
            km +=10;



            command = scanner.nextLine();

        }

        System.out.printf("Racing car %s DNF.%n",numberOfCar);

        System.out.printf("Distance covered %d km.%n",km);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);

            }
            System.out.println();
        }



    }
}
