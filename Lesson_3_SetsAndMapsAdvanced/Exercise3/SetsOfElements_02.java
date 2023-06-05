package Advanced.Lesson3_SetsAndMapsAdvanced.Exercise3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split("\\s+");
        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        Set<Integer> thirdSet = new LinkedHashSet<>();

        for (int i = 0; i < first; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            firstSet.add(currentNum);
        }
        for (int i = 0; i < second; i++) {
            int currentNum2 = Integer.parseInt(scanner.nextLine());
            secondSet.add(currentNum2);
        }
        for (Integer number : firstSet) {
            if (secondSet.contains(number)){
                thirdSet.add(number);
            }
        }
        thirdSet.forEach(el -> System.out.print(el+" "));

    }
}
