package Advanced.Exams;

import java.util.Arrays;
import java.util.Scanner;

public class _02_StickyFingers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int markerRow = -1;
        int markerCol = -1;
        int cash = 0;

        int size = Integer.parseInt(scanner.nextLine());
        String [] input = scanner.nextLine().split(",");
        char[][]matrix = new char[size][size];

        for (int row = 0; row <size ; row++) {
            char [] matrixRow = scanner.nextLine().replace(" ","").toCharArray();
            matrix[row] = matrixRow;

        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 'D'){
                    markerRow = row;
                    markerCol = col;
                }

            }
        }
        for (int i = 0; i < input.length; i++) {
            matrix[markerRow][markerCol] = '+';
            String command = input[i];
            switch (command){
                case"up":
                    markerRow -- ;
                    break;
                case"down":
                    markerRow ++;
                    break;
                case"left":
                    markerCol -- ;
                    break;
                case"right":
                    markerCol++;
                    break;


            }
            if (markerRow < 0 || markerRow >= size || markerCol< 0 || markerCol >= size){
                System.out.println("You cannot leave the town, there is police outside!");
                switch (command){
                    case"up":
                        markerRow ++ ;
                        break;
                    case"down":
                        markerRow --;
                        break;
                    case"left":
                        markerCol ++ ;
                        break;
                    case"right":
                        markerCol--;
                        break;


                }

            }
            if (matrix[markerRow][markerCol] == '$'){
                cash+= markerCol * markerRow;
                int currentCash = markerCol * markerRow;
                System.out.printf("You successfully stole %d$.%n",currentCash);

            }else if (matrix[markerRow][markerCol] == 'P'){
                System.out.printf("You got caught with %d$, and you are going to jail.%n",cash);
                matrix[markerRow][markerCol] = '#';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        System.out.print(matrix[row][col]+" ");

                    }
                    System.out.println();
                }
                return;
            }
            matrix[markerRow][markerCol] = 'D';




        }
        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n",cash);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]+" ");

            }
            System.out.println();
        }



        }

    }

