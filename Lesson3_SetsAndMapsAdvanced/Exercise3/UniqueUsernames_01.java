package Advanced.Lesson3_SetsAndMapsAdvanced.Exercise3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Set<String>nameSet = new LinkedHashSet<>();

        for (int i = 0; i < num; i++) {
            String  name = scanner.nextLine();
            nameSet.add(name);

        }
        for (String s : nameSet) {

            System.out.println(s);
        }
    }
}
