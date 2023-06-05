package Advanced.Lesson3_SetsAndMapsAdvanced.Exercise3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  text = scanner.nextLine();
        TreeMap<Character,Integer>  charMap = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (!charMap.containsKey(currentChar)){
                charMap.put(currentChar,1);
            }else {
                charMap.put(currentChar,charMap.get(currentChar)+1);
            }
        }
        charMap.entrySet().stream().forEach(el -> System.out.printf("%s: %d time/s%n",el.getKey(),el.getValue()));
        //S: 1 time/s
//        for (Map.Entry<Character, Integer> element : charMap.entrySet()) {
//            System.out.printf("%s: %d time/s%n",element.getKey(),element.getValue());
//
//        }

    }
}
