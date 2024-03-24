package Advanced.Lesson3_SetsAndMapsAdvanced.Lection3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")){
            guests.add(input);
            input = scanner.nextLine();
        }
        while (!input.equals("END")){
            guests.remove(input);
            input = scanner.nextLine();
        }
        System.out.println(guests.size());
        for (String element : guests) {
            System.out.println(element);

        }


    }
}
