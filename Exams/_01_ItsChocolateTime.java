package Advanced.Exams;

import java.util.*;

public class _01_ItsChocolateTime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double [] milk =Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        double [] cacao =Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Queue<Double> milkQ = new ArrayDeque<>();
        Deque<Double> cacaoD =  new ArrayDeque<>();

        Arrays.stream(milk).forEach(milkQ::offer);
        Arrays.stream(cacao).forEach(cacaoD::push);

        Map<String,Integer> map = new TreeMap<>();


        while (!milkQ.isEmpty() && !cacaoD.isEmpty()){
            double currentMilk = milkQ.peek();
            double currentCacao = cacaoD.peek();
            double currentSum = (currentCacao /(currentMilk + currentCacao))*100;

            if (currentSum == 30){
                if (!map.containsKey("Milk Chocolate")){
                    map.put("Milk Chocolate",1);
                    milkQ.poll();
                    cacaoD.pop();

                }else {
                    map.put("Milk Chocolate",map.get("Milk Chocolate")+1);
                    milkQ.poll();
                    cacaoD.pop();

                }
            }else if (currentSum == 50){
                if (!map.containsKey("Dark Chocolate")){
                    map.put("Dark Chocolate",1);
                    milkQ.poll();
                    cacaoD.pop();

                }else {
                    map.put("Dark Chocolate",map.get("Dark Chocolate")+1);
                    milkQ.poll();
                    cacaoD.pop();

                }

            }else if (currentSum == 100){
                if (!map.containsKey("Baking Chocolate")){
                    map.put("Baking Chocolate",1);
                    milkQ.poll();
                    cacaoD.pop();

                }else {
                    map.put("Baking Chocolate",map.get("Baking Chocolate")+1);
                    milkQ.poll();
                    cacaoD.pop();

                }
            }else {
                milkQ.offer(milkQ.poll()+10);
                cacaoD.pop();

            }



        }
        if (map.size() >= 3){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.printf(" # %s --> %d%n",element.getKey(),element.getValue());
        }

        }
}
