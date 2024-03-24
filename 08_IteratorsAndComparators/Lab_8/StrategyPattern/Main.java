package Advanced.Lesson_8_IteratorsAndComparators.Lab_8.StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Person> personByName = new TreeSet<>(new ComparatorByName());
        Set<Person>personByAge = new TreeSet<>(new ComparatorByAge());
        int n = Integer.parseInt(scan.nextLine());
        IntStream.range(0, n).mapToObj(i -> scan.nextLine().split("\\s+")).forEach(input -> {
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            personByName.add(person);
            personByAge.add(person);
        });
        personByName.forEach(System.out::println);
        personByAge.forEach(System.out::println);
    }
}
