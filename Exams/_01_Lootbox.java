package Advanced.Exams;

import java.util.*;

public class _01_Lootbox {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] box1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] box2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Queue<Integer> boxQ = new ArrayDeque<>();
        Deque<Integer> boxD =new ArrayDeque<>();

        Arrays.stream(box1).forEach(boxQ::offer);
        Arrays.stream(box2).forEach(boxD::push);

        int sum = 0;

        while (!boxD.isEmpty() && !boxQ.isEmpty()) {
            int currentBox1 = boxQ.peek();
            int currentBox2 =  boxD.peek();

            int currentSum = currentBox1 + currentBox2 ;

            if (currentSum %2 == 0){
                boxQ.poll();
                boxD.pop();
                sum+=currentSum;
            }else {
                boxQ.offer(boxD.pop());
            }
        }
        if (boxQ.isEmpty()){
            System.out.println("First lootbox is empty");
        }else {
            System.out.println("Second lootbox is empty");
        }

        if (sum< 100){
            System.out.printf("Your loot was poor... Value: %d",sum);

        }else {
            System.out.printf("Your loot was epic! Value: %d",sum);
        }


    }
}
