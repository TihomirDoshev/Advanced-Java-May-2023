package Advanced.Lesson_5_Functional_Programming.Lab_5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort_Even_Numbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(",\\s+");

        List<String> evenNumbers = Arrays.stream(input).map(Integer::parseInt).filter(e -> e %2 == 0 ).map(e -> e.toString()).
                collect(Collectors.toList());
        System.out.println(String.join(", ",evenNumbers));

        evenNumbers = evenNumbers.stream().map(Integer::parseInt).sorted().map(e -> e.toString(e)).collect(Collectors.toList());
        System.out.println(String.join(", ",evenNumbers));

    }
}
