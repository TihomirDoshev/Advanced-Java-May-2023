package Advanced.Lesson_5_Functional_Programming.Lab_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Find_Evens_Or_Odds_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split("\\s+");
        int start = Integer.parseInt(input[0]);
        int stop = Integer.parseInt(input[1]);

        List<Integer> numbers = new ArrayList<>();

        for (int i = start; i <= stop ; i++) {
            numbers.add(i);
        }
        String evenOrOdd = scanner.nextLine();

        Predicate <Integer> filterNumbers = evenOrOdd.equals("even") ? e -> e % 2 == 0 : e -> e % 2 != 0;

//        if (evenOrOdd.equals("even")){
//            filterNumbers = e -> e % 2 == 0;
//
//        }else if (evenOrOdd.equals("odd")){
//
//            filterNumbers  = e -> e % 2 != 0;
//
//        }
        numbers.stream().filter(filterNumbers).forEach(e -> System.out.print(e + " "));



    }
}
