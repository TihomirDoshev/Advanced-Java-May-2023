package Advanced.Lesson3_SetsAndMapsAdvanced.Exercise3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String>map = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")){

            String [] parts = input.split("-");
            String name = parts[0];
            String phone = parts[1];

            if (!map.containsKey(name)){
                map.put(name,phone);
            }else {
                map.put(name,phone);
            }
            input = scanner.nextLine();

        }
        String input2 =scanner.nextLine();
        while (!input2.equals("stop")){
            if (map.containsKey(input2)){
                System.out.printf("%s -> %s%n",input2,map.get(input2));
            }else {
                System.out.printf("Contact %s does not exist.%n",input2);
            }

            input2 =scanner.nextLine();
        }
    }
}
