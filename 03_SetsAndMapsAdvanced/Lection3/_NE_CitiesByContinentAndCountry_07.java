package Advanced.Lesson3_SetsAndMapsAdvanced.Lection3;

import java.util.*;

public class _NE_CitiesByContinentAndCountry_07 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Map<String,List<String>> countyMap = new LinkedHashMap<>();
        Map<String, List<String>> cityMap = new LinkedHashMap<>();




        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            String [] parts = input.split("\\s+");
            String continent = parts[0];
            String country = parts[1];
            String city = parts[2];

            if (!countyMap.containsKey(continent)){
                countyMap.put(continent,new ArrayList<>());
                countyMap.get(continent).add(country);
                cityMap.put(continent,new ArrayList<>());
                cityMap.get(continent).add(city);

            }else {
                countyMap.get(continent).add(country);
                cityMap.get(continent).add(city);
            }




        }
        for (Map.Entry<String, List<String>> element : countyMap.entrySet()) {
            System.out.printf("%s:%n",element.getKey());
            for (int i = 0; i < element.getValue().size(); i++) {
                System.out.printf("%s -> %n",element.getValue().get(i));



            }







        }


    }
}
