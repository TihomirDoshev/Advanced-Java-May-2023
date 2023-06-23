package Advanced.Exams;

import java.util.*;

public class _01_AutumnCocktails {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        //first bucket of ingredients and the last freshness level value

       int [] bucket= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
       int [] freshness= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Queue<Integer> bucketQ = new ArrayDeque<>();
        Deque<Integer> freshnessD = new ArrayDeque<>();


        Arrays.stream(bucket).forEach(bucketQ::offer);
        Arrays.stream(freshness).forEach(freshnessD::push);

        Map<String,Integer> map = new TreeMap<>();


        while (!bucketQ.isEmpty() && !freshnessD.isEmpty()){
            int currentBucket = bucketQ.peek();
            int currentFreshness = freshnessD.peek();
            if (currentBucket ==0){
                bucketQ.poll();
                continue;
            }
//            if (currentFreshness == 0){
//                freshnessD.pop();
//                continue;
//            }
            int sum = currentFreshness*currentBucket;

            if (sum ==150){
                if (!map.containsKey("Pear Sour")){
                    map.put("Pear Sour",1);
                }else {
                    map.put("Pear Sour", map.get("Pear Sour")+1);
                }
                bucketQ.poll();
                freshnessD.pop();
            } else if (sum == 250) {
                if (!map.containsKey("The Harvest")){
                    map.put("The Harvest",1);
                }else {
                    map.put("The Harvest", map.get("The Harvest")+1);
                }
                bucketQ.poll();
                freshnessD.pop();

            } else if (sum == 300) {
                if (!map.containsKey("Apple Hinny")){
                    map.put("Apple Hinny",1);
                }else {
                    map.put("Apple Hinny", map.get("Apple Hinny")+1);
                }
                bucketQ.poll();
                freshnessD.pop();


            } else if (sum == 400) {
                if (!map.containsKey("High Fashion")){
                    map.put("High Fashion",1);
                }else {
                    map.put("High Fashion", map.get("High Fashion")+1);
                }
                bucketQ.poll();
                freshnessD.pop();


            }else {
                bucketQ.offer(bucketQ.poll()+5);
                freshnessD.pop();

            }


        }
        int queueSum = 0;
        while (!bucketQ.isEmpty()){
            int n = bucketQ.poll();
            queueSum +=n;
        }
        if (map.size() == 4){
            System.out.println("It's party time! The cocktails are ready!");
            for (Map.Entry<String, Integer> element : map.entrySet()) {
                System.out.printf(" # %s --> %d%n",element.getKey(),element.getValue());

            }

        }else {

            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
            if (queueSum>0){
                System.out.printf("Ingredients left: %d%n",queueSum);

            }
            for (Map.Entry<String, Integer> element : map.entrySet()) {
                System.out.printf(" # %s --> %d%n",element.getKey(),element.getValue());

            }

        }

    }
}
