package Advanced.Lesson3_SetsAndMapsAdvanced.Lection3;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] numbersArr= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < numbersArr.length; i++) {
            double currentNum = numbersArr[i];

            if (!map.containsKey(currentNum)){
                map.put(currentNum,1);
            }else {
                map.put(currentNum,map.get(currentNum) + 1);
            }
        }
        for (Map.Entry<Double, Integer> element : map.entrySet()) {
            System.out.printf("%.1f -> %d%n",element.getKey(),element.getValue() );;

        }


    }
}
