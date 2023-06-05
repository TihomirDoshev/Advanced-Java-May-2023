package Advanced.Lesson3_SetsAndMapsAdvanced.Exercise3;

import java.util.*;

public class PeriodicTable_03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Set<String> set = new TreeSet<>();

        for (int i = 0; i < num; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            set.addAll(Arrays.asList(elements));

        }
         set.forEach(el -> System.out.print(el+" "));
    }
}
