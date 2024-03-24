package Advanced.Lesson_5_Functional_Programming.Lab_5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Filter_by_Age_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        Map<String,Integer> personMap = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split(",\\s+");
            String name = input[0];
            int age = Integer.parseInt (input[1]);
             if (!personMap.containsKey(name)){
                 personMap.put(name,age);
             }else {
                 personMap.put(name,age);

             }


        }
        String older_younger = scanner.nextLine();
       int currentYear = Integer.parseInt(scanner.nextLine());
        String model = scanner.nextLine();
        BiPredicate <Integer,Integer> filterAge ;
        if (older_younger.equals("younger")){
            filterAge = (personAge,age) -> personAge <= age;
        }else {
            filterAge = (personAge,age) ->personAge >= age;
        }
        Consumer<Map.Entry<String,Integer>> printer;
        if (model.equals("name")){
            printer = e -> System.out.println(e.getKey());

        }else if (model.equals("age")){
            printer = e -> System.out.println(e.getValue());

        }else {
            printer = e -> System.out.printf("%s - %d%n",e.getKey(),e.getValue());
        }
        personMap.entrySet().stream().filter(e -> filterAge.test(e.getValue(),currentYear))
                .forEach(printer);








    }
}
