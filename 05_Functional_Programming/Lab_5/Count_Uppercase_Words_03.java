package Advanced.Lesson_5_Functional_Programming.Lab_5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Count_Uppercase_Words_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        Predicate<String> upperCasePredicate = e -> Character.isUpperCase(e.charAt(0));
        Consumer<String>  printer = e -> System.out.println(e);

        List<String> capital = Arrays.stream(input).filter(upperCasePredicate).collect(Collectors.toList());

        System.out.println(capital.size());
        capital.forEach(printer);

    }
}
