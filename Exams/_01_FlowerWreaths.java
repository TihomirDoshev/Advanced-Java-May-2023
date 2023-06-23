package Advanced.Exams;

import java.util.*;

public class _01_FlowerWreaths {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> liliesD = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(liliesD::push);

        Queue<Integer> rosesQ = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(rosesQ::offer);

        int countOfBuckets = 0;
        int remainingFlowers = 0;

        while (!liliesD.isEmpty() && !rosesQ.isEmpty()){
            int currentLiliesD = liliesD.peek();
            int currentRosesQ = rosesQ.peek();
            int sum = currentRosesQ + currentLiliesD;

            if (sum == 15 ){
                countOfBuckets ++;
                liliesD.pop();
                rosesQ.poll();

            }else if (sum > 15){
                while (currentLiliesD > 0 ){
                    currentLiliesD-=2;
                    int newSum = currentLiliesD + currentRosesQ;
                    if (newSum == 15){
                        countOfBuckets ++;
                        liliesD.pop();
                        rosesQ.poll();
                        break;


                    }else if (newSum < 15){
                        remainingFlowers +=newSum;
                        liliesD.pop();
                        rosesQ.poll();
                        break;
                    }

                }
            }else {
                remainingFlowers += sum;
                liliesD.pop();
                rosesQ.poll();

            }



        }
        int moreBuckets = remainingFlowers / 15;
        countOfBuckets += moreBuckets;

        if (countOfBuckets >= 5){
            System.out.printf("You made it, you are going to the competition with %d wreaths!",countOfBuckets);
        }else {
            System.out.printf("You didn't make it, you need %d wreaths more!",5 - countOfBuckets);
        }


    }
}
