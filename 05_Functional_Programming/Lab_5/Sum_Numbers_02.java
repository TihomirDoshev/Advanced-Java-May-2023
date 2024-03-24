package Advanced.Lesson_5_Functional_Programming.Lab_5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sum_Numbers_02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(",\\s+");

        List<Integer> numbers = Arrays.stream(input).map(e->Integer.parseInt(e)).collect(Collectors.toList());

        System.out.println("Count = "+ numbers.size());
        int sum = Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).sum();
        System.out.println("Sum = "+sum);
    }
}
