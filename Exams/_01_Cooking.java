package Advanced.Exams;

import java.util.*;

public class _01_Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liquids = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] ingredients = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Queue<Integer> liquidsQ = new ArrayDeque<>();
        Deque<Integer> ingredientsD = new ArrayDeque<>();

        Arrays.stream(liquids).forEach(liquidsQ::offer);
        Arrays.stream(ingredients).forEach(ingredientsD::push);

        Map<String, Integer> map = new TreeMap<>();
        map.put("Bread", 0);
        map.put("Cake", 0);
        map.put("Pastry", 0);
        map.put("Fruit Pie", 0);

        while (!liquidsQ.isEmpty() && !ingredientsD.isEmpty()) {
            int currentQ = liquidsQ.peek();
            int currentD = ingredientsD.peek();
            int currentSum = currentD + currentQ;
            //Bread	25
            //Cake	50
            //Pastry	75
            //Fruit Pie	100
            if (currentSum == 25) {
                map.put("Bread", map.get("Bread") + 1);
                liquidsQ.poll();
                ingredientsD.pop();
            } else if (currentSum == 50) {
                map.put("Cake", map.get("Cake") + 1);
                liquidsQ.poll();
                ingredientsD.pop();

            } else if (currentSum == 75) {
                map.put("Pastry", map.get("Pastry") + 1);
                liquidsQ.poll();
                ingredientsD.pop();

            } else if (currentSum == 100) {
                map.put("Fruit Pie", map.get("Fruit Pie") + 1);
                liquidsQ.poll();
                ingredientsD.pop();
            } else {
                //increase the value of the ingredient by 3
                liquidsQ.poll();
                ingredientsD.push(ingredientsD.pop() + 3);

            }

        }
        int counter = 0;

        for (Map.Entry<String, Integer> element : map.entrySet()) {
            if (element.getValue() > 0) {
                counter++;
            }

        }
        if (counter >= 4) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");

        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }
        if (liquidsQ.size() > 0) {
            System.out.print("Liquids left: ");
            for (Integer element : liquidsQ) {
                if (liquidsQ.size() > 1) {
                    System.out.print(element + ", ");

                } else {
                    System.out.println(element);
                }
                liquidsQ.poll();

            }

        }else {
            System.out.println("Liquids left: none");

        }
        if (ingredientsD.size() > 0) {
            System.out.print("Ingredients left: ");
            for (Integer element : ingredientsD) {
                if (ingredientsD.size() > 1) {
                    System.out.print(element + ", ");

                } else {
                    System.out.println(element);
                }
                ingredientsD.pop();

            }
        }else {
            System.out.println("Ingredients left: none");
        }
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.printf("%s: %d%n",element.getKey(),element.getValue());

        }
    }
}
