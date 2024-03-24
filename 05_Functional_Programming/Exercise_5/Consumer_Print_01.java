package Advanced.Lesson_5_Functional_Programming.Exercise_5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Consumer_Print_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> print = e -> System.out.println(e);

        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(print);
    }
}
