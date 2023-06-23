package Advanced.Exams;

import java.util.*;
import java.util.stream.Collectors;

public class _01_Bouquets {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> tulipsD = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(tulipsD::push);

        Queue<Integer> daffodilsQ = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(daffodilsQ::offer);

        int countOfBuckets = 0;
        int remainingFlowers = 0;

        while (!tulipsD.isEmpty() && !daffodilsQ.isEmpty()){
            int currentTulipsD = tulipsD.peek();
            int currentDaffodilsQ = daffodilsQ.peek();
            int sum = currentDaffodilsQ + currentTulipsD;

            if (sum == 15 ){
                countOfBuckets ++;
                tulipsD.pop();
                daffodilsQ.poll();

            }else if (sum > 15){
                while (currentTulipsD > 0 ){
                    currentTulipsD-=2;
                    int newSum = currentTulipsD + currentDaffodilsQ;
                    if (newSum == 15){
                        countOfBuckets ++;
                        tulipsD.pop();
                        daffodilsQ.poll();
                        break;


                    }else if (newSum < 15){
                        remainingFlowers +=newSum;
                        tulipsD.pop();
                        daffodilsQ.poll();
                        break;
                    }

                }
            }else {
                remainingFlowers += sum;
                tulipsD.pop();
                daffodilsQ.poll();

            }



        }
        int moreBuckets = remainingFlowers / 15;
        countOfBuckets += moreBuckets;

        if (countOfBuckets >= 5){
            System.out.printf("You made it! You go to the competition with %d bouquets!",countOfBuckets);
        }else {
            System.out.printf("You failed... You need more %d bouquets.",5 - countOfBuckets);
        }
    }
}
