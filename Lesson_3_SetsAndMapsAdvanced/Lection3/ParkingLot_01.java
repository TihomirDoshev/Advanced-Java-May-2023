package Advanced.Lesson3_SetsAndMapsAdvanced.Lection3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> carLots = new LinkedHashSet<>();

        String input = scanner.nextLine();


        while (!input.equals("END")) {

            String[] parts = input.split(",\\s+");
            String command = parts[0];
            String plate = parts[1];


            if (command.equals("IN")) {
                carLots.add(plate);

            }else {
                carLots.remove(plate);
            }
            input = scanner.nextLine();

        }
        if (carLots.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }

        for (String element : carLots) {
            System.out.println(element);

        }
    }
}
