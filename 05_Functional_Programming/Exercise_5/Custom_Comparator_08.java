package Advanced.Lesson_5_Functional_Programming.Exercise_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Custom_Comparator_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> false / true -> test
        //BiFunction<приема1, приема2, връща> -> apply

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());



        Comparator<Integer> comparator = ((first, second) -> {

            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            }

            else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            }

            else {
                return first.compareTo(second);

            }

        });

        numbers.stream().sorted(comparator).forEach(number -> System.out.print(number + " "));



    }

}
