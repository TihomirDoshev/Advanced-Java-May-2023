package Advanced.Lesson_7_Generics.Exercise_7._08_CustomListSorter;
//created by J.M.

import java.util.Collections;
import java.util.List;
import java.util.Collections;
import java.util.List;

public class Sorter {

    public static <T extends Comparable<T>> void sort(List<T>data) {
        Collections.sort(data);
    }
}
