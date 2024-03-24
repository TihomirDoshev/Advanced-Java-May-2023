package Advanced.Lesson_5_Functional_Programming.Exercise_5;

import java.util.Arrays;
import java.util.Scanner;

public class Knights_Of_Honor_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> System.out.println("Sir "+e));
    }
}
