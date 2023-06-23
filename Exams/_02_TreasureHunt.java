package Advanced.Exams;

import java.util.*;

public class _02_TreasureHunt {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int markerRow = -1;
        int markerCol = -1;
        Queue <String> path = new ArrayDeque<>();

        char [][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputRow = scanner.nextLine().split("\\s+");
            char[] currentRow = new char[inputRow.length];
            String c = "";
            for (String s : inputRow) {
                c += s;
                currentRow = c.toCharArray();

            }
            matrix[row] = currentRow;


        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 'Y'){
                    markerRow = row;
                    markerCol = col;

                }
            }
        }

        String command = scanner.nextLine();
        //up, down, right, and left.
        while (!command.equals("Finish")){
            matrix[markerRow][markerCol] = '-';
            switch (command){
                case "up":
                    markerRow --;
                    break;

                case "down":
                    markerRow ++;
                    break;

                case "right":
                    markerCol ++;
                    break;

                case "left":
                    markerCol--;
                    break;
            }
            if (markerRow < 0  || markerRow >= rows || markerCol < 0 || markerCol >= cols) {
                if (command.equals("left")) {
                    markerCol++;
                } else if (command.equals("right")) {
                    markerCol--;

                } else if (command.equals("down")) {
                    markerRow--;

                } else if (command.equals("up")) {
                    markerRow++;

                }


            }else if (matrix[markerRow][markerCol] == 'T'){
//                int treeRow = markerRow;
//                int treCol = markerCol;
                if (command.equals("left")){
                    markerCol++;
                } else if (command.equals("right")) {
                    markerCol--;

                } else if (command.equals("down")) {
                    markerRow--;

                } else if (command.equals("up")) {
                    markerRow ++;

                }

            } else if (matrix[markerRow][markerCol] == 'X') {
                path.offer(command);
                System.out.println("I've found the treasure!");
                System.out.print("The right path is ");
                for (String s : path) {
                    if (path.size() > 1){
                        System.out.printf("%s, ",s);

                    }else {
                        System.out.println(s);
                    }
                    path.poll();

                }

                return;

            }else {
                path.offer(command);

            }
            matrix[markerRow][markerCol] = 'Y';




            command = scanner.nextLine();
        }
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                if (matrix[row][col] == 'X'){
//                    System.out.println("The map is fake!");
//                }
//
//
//            }
//
//        }
        System.out.println("The map is fake!");





    }
}