package Advanced.Lesson_5_Functional_Programming.Exercise_5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate_For_Names_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        //
        Predicate<String> checkValidLength = name -> name.length() <= n;

        Arrays.stream(names).filter(checkValidLength)
                .forEach(System.out::println);

    }
}
