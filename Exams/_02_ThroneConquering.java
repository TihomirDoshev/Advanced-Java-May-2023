package Advanced.Exams;

import java.util.Scanner;

public class _02_ThroneConquering {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][];
        int markerRow = -1;
        int markerCol = -1;

        for (int row = 0; row < size; row++) {
            char [] matrixRow = scanner.nextLine().toCharArray();
            matrix[row] = matrixRow;
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'P'){
                    markerRow = row;
                    markerCol = col;

                }
            }
        }
        while (energy > 0){
            String command = scanner.nextLine();

            String direction = command.split("\\s+")[0];
            int enemyRow = Integer.parseInt(command.split("\\s+")[1]);
            int enemyCol = Integer.parseInt(command.split("\\s+")[2]);

            matrix[markerRow][markerCol] = '-';
            matrix[enemyRow][enemyCol] = 'S';

            switch (direction){
                case "up":
                    markerRow -- ;
                    break;
                case "down":
                    markerRow ++;
                    break;
                case "left":
                    markerCol --;
                    break;
                case "right":
                    markerCol ++;
                    break;
            }

            if (markerRow < 0  || markerRow >= matrix.length || markerCol < 0 || markerCol >= matrix.length){

                switch (direction){
                    case "up":
                        markerRow ++ ;
                        break;
                    case "down":
                        markerRow --;
                        break;
                    case "left":
                        markerCol ++;
                        break;
                    case "right":
                        markerCol --;
                        break;
                }


            }


            if (matrix[markerRow][markerCol] == 'S'){
                energy-=2;


            }else if (matrix[markerRow][markerCol] == 'H'){
                matrix[markerRow][markerCol] = '-';
                energy--;
                System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n",energy);
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < matrix[row].length; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }

                return;
            }
            matrix[markerRow][markerCol] = 'P';
            energy--;

            if (energy<=0){
                System.out.printf("Paris died at %d;%d.%n",markerRow,markerCol);
                matrix[markerRow][markerCol] = 'X';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < matrix[row].length; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                return;

            }




        }




    }
}
