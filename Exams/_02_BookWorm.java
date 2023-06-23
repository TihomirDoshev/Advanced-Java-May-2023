package Advanced.Exams;

import java.util.Scanner;

public class _02_BookWorm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String startWord = scanner.nextLine();
        int size = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder(startWord);

        char[][]matrix = new char[size][size];

        int markerRow = -1;
        int markerCol = -1;


        for (int row = 0; row < size; row++) {
            char [] matrixRow = scanner.nextLine().toCharArray();
            matrix[row] = matrixRow;
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 'P'){
                    markerRow = row;
                    markerCol = col;

                }
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("end")){
            matrix[markerRow][markerCol] = '-';
            switch (command){
                //"up", "down", "left", "right".
                case"up":
                    markerRow --;
                    break;
                case"down":
                    markerRow ++;
                    break;
                case"left":
                    markerCol --;
                    break;
                case"right":
                    markerCol ++;
                    break;
            }
            if (markerRow <0 || markerRow >= size || markerCol <0 || markerCol >= size) {
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
                sb.deleteCharAt(sb.length() - 1);
            }
            if (Character.isLetter(matrix[markerRow][markerCol])){
                sb.append(matrix[markerRow][markerCol]);

            }
            matrix[markerRow][markerCol] = 'P';
            command = scanner.nextLine();
        }
        System.out.println(sb.toString());
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }

    }
}
