package Advanced.Lesson3_SetsAndMapsAdvanced.Exercise3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String>map =new LinkedHashMap<>();

        String  name = scanner.nextLine();
        while (!name.equals("stop")){
            String mail = scanner.nextLine();
            if (!mail.endsWith("us") && !mail.endsWith("uk") && !mail.endsWith("com") ){
                map.put(name,mail);

            }
            name = scanner.nextLine();
        }
        map.entrySet().forEach(el -> System.out.printf("%s -> %s%n",el.getKey(),el.getValue()));
    }
}
