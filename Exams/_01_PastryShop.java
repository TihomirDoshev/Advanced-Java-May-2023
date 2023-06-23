package Advanced.Exams;

import java.util.*;

public class _01_PastryShop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] liquids = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] ingredients = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Queue<Integer> liquidsQ = new ArrayDeque<>();
        Arrays.stream(liquids).forEach(liquidsQ::offer);

        Deque<Integer> ingredientsD = new ArrayDeque<>();
        Arrays.stream(ingredients).forEach(ingredientsD::push);

        Map<String,Integer> map = new LinkedHashMap<>();
        map .put("Biscuit",0);
        map .put("Cake",0);
        map .put("Pie",0);
        map .put("Pastry",0);


        while (!liquidsQ.isEmpty() && !ingredientsD.isEmpty()){
            int currentLiquids = liquidsQ.peek();
            int currentIngredients = ingredientsD.peek();

            int sum = currentIngredients + currentLiquids;

            //Biscuit	25
            //Cake	50
            //Pastry	75
            //Pie	100
            if (sum == 25){
                map.put("Biscuit",map.get("Biscuit") + 1);
                liquidsQ.poll();
                ingredientsD.pop();

            }else if (sum == 50){
                map.put("Cake",map.get("Cake") + 1);
                liquidsQ.poll();
                ingredientsD.pop();

            }else if (sum == 75) {
                map.put("Pastry", map.get("Pastry") + 1);
                liquidsQ.poll();
                ingredientsD.pop();

            }else if (sum == 100) {
                map.put("Pie", map.get("Pie") + 1);
                liquidsQ.poll();
                ingredientsD.pop();

            }else {
                //remove only the liquid and increase the value of the ingredient by 3
                liquidsQ.poll();
                ingredientsD.push(ingredientsD.pop() + 3);
            }





        }
        int count = 0;
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            if (element.getValue() > 0 ){
                count ++;

            }

        }
        if (count>=4){
            System.out.println("Great! You succeeded in cooking all the food!");
        }else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }
        if (!liquidsQ.isEmpty()){
            System.out.print("Liquids left: ");
            System.out.println(liquidsQ.toString().replace("[","").replace("]",""));

        }else {
            System.out.println("Liquids left: none");

        }
        if (!ingredientsD.isEmpty()){
            System.out.print("Ingredients left: ");
            System.out.println(ingredientsD.toString().replace("[","").replace("]",""));


        }else {
            System.out.println("Ingredients left: none");
        }
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.println(element.getKey()+": "+element.getValue());

        }



    }
}
