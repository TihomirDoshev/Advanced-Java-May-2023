package Advanced.Lesson3_SetsAndMapsAdvanced.Lection3;

import java.util.*;

public class ProductShop_06 {
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> productMap =new TreeMap<>();
        Map<String, List<Double>> priceMap =new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Revision")){
            String [] parts = input.split(",\\s+");
            String shop = parts[0];
            String product = parts[1];
            double price = Double.parseDouble(parts[2]);

            if (!productMap.containsKey(shop)){
                productMap.put(shop,new ArrayList<>());
                productMap.get(shop).add(product);
                priceMap.put(shop,new ArrayList<>());
                priceMap.get(shop).add(price);

            }else {
                productMap.get(shop).add(product);
                priceMap.get(shop).add(price);


            }
            input = scanner.nextLine();

        }
        for (Map.Entry<String, List<String>> element : productMap.entrySet()) {
            System.out.printf("%s->%n",element.getKey());
            for (int i = 0; i < element.getValue().size(); i++) {
                System.out.printf("Product: %s, Price: %.1f%n",element.getValue().get(i),priceMap.get(element.getKey()).get(i));

            }


        }

    }
}
