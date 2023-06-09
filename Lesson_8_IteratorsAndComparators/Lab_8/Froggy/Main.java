package Advanced.Lesson_8_IteratorsAndComparators.Lab_8.Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Lake lake = new Lake(Arrays.stream(scan.nextLine().trim().split(", ")).mapToInt(Integer::parseInt).toArray());
        Iterator<Integer> iterator= lake.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next().toString();
            System.out.print(iterator.hasNext() ? String.format("%s, ",current) : current);
        }
    }
}
