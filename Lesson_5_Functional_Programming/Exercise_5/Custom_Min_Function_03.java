package Advanced.Lesson_5_Functional_Programming.Exercise_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Custom_Min_Function_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>,Integer> minNum = e -> Collections.min(e);

        System.out.println(minNum.apply(list));



    }
}
