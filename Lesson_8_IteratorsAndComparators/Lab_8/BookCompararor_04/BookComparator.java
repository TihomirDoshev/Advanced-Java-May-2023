package Advanced.Lesson_8_IteratorsAndComparators.Lab_8.BookCompararor_04;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book first , Book second) {

        int result = first.getTitle().compareTo(second.getTitle());
        return result!=0 ? result : Integer.compare(first.getYear(),second.getYear());

    }
}
