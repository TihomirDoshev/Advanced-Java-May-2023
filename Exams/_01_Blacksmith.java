package Advanced.Exams;

import java.util.*;

public class _01_Blacksmith {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

         int []  numberQueue = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
         int []  numberDeque = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Queue<Integer> stealQ = new ArrayDeque<>();
        Deque<Integer> carbonD = new ArrayDeque<>();

        Map<String,Integer> map = new TreeMap<>();

        Arrays.stream(numberQueue).forEach(stealQ :: offer);
        Arrays.stream(numberDeque).forEach(carbonD ::push );

        while (!stealQ.isEmpty() && !carbonD.isEmpty()){
            int currentSteal = stealQ.peek();
            int currentCarbon = carbonD.peek();

            int sum = currentCarbon + currentSteal;

            //Gladius	70
            //Shamshir	80
            //Katana	90
            //Sabre	110
            if (sum == 70){
                if (!map.containsKey("Gladius")){
                    map.put("Gladius",1);
                }else {
                    map.put("Gladius", map.get("Gladius" )+1);
                }
                stealQ.poll();
                carbonD.pop();
            } else if (sum == 80) {
                if (!map.containsKey("Shamshir")){
                    map.put("Shamshir",1);
                }else {
                    map.put("Shamshir", map.get("Shamshir" )+1);
                }
                stealQ.poll();
                carbonD.pop();


            } else if (sum == 90) {
                if (!map.containsKey("Katana")){
                    map.put("Katana",1);
                }else {
                    map.put("Katana", map.get("Katana" )+1);
                }
                stealQ.poll();
                carbonD.pop();


            } else if (sum == 110) {
                if (!map.containsKey("Sabre")){
                    map.put("Sabre",1);
                }else {
                    map.put("Sabre", map.get("Sabre" )+1);
                }
                stealQ.poll();
                carbonD.pop();


            }else {
                stealQ.poll();
                carbonD.push(carbonD.pop() + 5);
            }


        }
        if (map.size() > 0){
            int swords = 0;
            for (Map.Entry<String, Integer> element : map.entrySet()) {
                swords = swords + element.getValue();

            }

            System.out.printf("You have forged %d swords.%n",swords);
        }else {
            System.out.println("You did not have enough resources to forge a sword.");
        }
        if (stealQ.isEmpty()){
            System.out.println("Steel left: none");

        }else {
            System.out.print("Steel left: ");
            for (Integer element : stealQ) {
                if (stealQ.size() >1){
                    System.out.print(element+", ");
                }else {
                    System.out.print(element);

                }
                stealQ.poll();


            }
            System.out.println();
        }
        if (carbonD.isEmpty()){
            System.out.println("Carbon left: none");
        }else {
            System.out.print("Carbon left: ");
            for (Integer el : carbonD) {
                if (carbonD.size()> 1){
                    System.out.print(el+", ");
                }else {
                    System.out.print(el);
                }
                carbonD.pop();


            }
            System.out.println();
        }
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.println(element.getKey()+": "+element.getValue());

        }


    }

}
