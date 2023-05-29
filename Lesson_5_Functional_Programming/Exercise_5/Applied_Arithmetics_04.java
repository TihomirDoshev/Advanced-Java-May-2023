package Advanced.Lesson_5_Functional_Programming.Exercise_5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Applied_Arithmetics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<Integer> numList =  Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply

        Function<List<Integer>,List<Integer>>add = list -> list.stream().map(e -> e +=1).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>>multiply = list -> list.stream().map(e -> e *=2).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>>subtract = list -> list.stream().map(e -> e -=1).collect(Collectors.toList());
        Consumer<List<Integer>> print = list -> list.stream().forEach(e -> System.out.print(e + " "));


       String  input = scanner.nextLine();

       while (!input.equals("end")){

           switch (input){
               case "add":
                  numList = add.apply(numList);

                   break;
               case "multiply":
                   numList = multiply.apply(numList);

                   break;
               case "subtract":
                   numList = subtract.apply(numList);

                   break;
               case "print":
                   print.accept(numList);
                   System.out.println();
                   break;
           }



           input = scanner.nextLine();
       }


    }
}
