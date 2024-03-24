package Advanced.Lesson_8_IteratorsAndComparators.Lab_8.StrategyPattern;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        return Integer.compare(first.getAge(),second.getAge());
    }
}