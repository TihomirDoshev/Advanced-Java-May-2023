package Advanced.Lesson_6_Defining_Classes.Exercise_6.OpinionPoll_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt (scanner.nextLine ());

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine ().split ("\\s+");
            Person person = new Person (info[0],Integer.parseInt (info[1]));
            people.add (person);
        }
        //people.sort (Comparator.comparing (Person::getName));


        people.stream ().filter (person -> person.getAge ()>30)
                .sorted ((f,s)->f.getName ().compareTo (s.getName ()))
                .forEach (System.out::println);
    }
}
