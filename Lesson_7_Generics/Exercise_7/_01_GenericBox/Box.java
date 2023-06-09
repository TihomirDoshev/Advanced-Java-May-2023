package Advanced.Lesson_7_Generics.Exercise_7._01_GenericBox;


import java.util.ArrayList;
import java.util.List;

public class Box<T> {
        private List<T> values;

        public Box() {
            this.values = new ArrayList<>();
        }

        public void add(T element) {
            this.values.add(element);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (T value : this.values) {
                sb.append(String.format("%s: %s", value.getClass().getName(), value)).append(System.lineSeparator());
            }
            return sb.toString();
        }
    }


