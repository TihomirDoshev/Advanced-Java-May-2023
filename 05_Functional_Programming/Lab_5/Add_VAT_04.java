package Advanced.Lesson_5_Functional_Programming.Lab_5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Add_VAT_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]input = scanner.nextLine().split(",\\s+");
        Function<String,Double>convertToDouble = Double::parseDouble;
        Function<Double,Double>addVat = e -> e * 1.2;
        Consumer<Double> printer = e -> System.out.printf("%.2f%n",e);


        System.out.println("Prices with VAT:");
        Arrays.stream(input).map(convertToDouble).map(addVat).forEach(printer);

        //Arrays.stream(scanner.nextLine().split(",\\s+")).map(Double::parseDouble)
        // .map(e ->e*1.2).forEach(e-> System.out.printf("%.2f%n",e));
    }
}
