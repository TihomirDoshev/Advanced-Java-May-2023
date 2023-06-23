package Advanced.Exams;

import java.util.*;

public class _01_Meeting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] male = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] female = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> maleD = new ArrayDeque<>();
        Queue<Integer> femaleQ = new ArrayDeque<>();

        Arrays.stream(male).forEach(maleD::push);
        Arrays.stream(female).forEach(femaleQ::offer);

        int countMatch = 0;

        while (!maleD.isEmpty() && !femaleQ.isEmpty()){

            int currentMale = maleD.peek();
            int currentFemale = femaleQ.peek();

            if (currentFemale <= 0){
                femaleQ.poll();
                continue;
            }
            if (currentMale <= 0){
                maleD.pop();
                continue;
            }
            if (currentFemale % 25 == 0){
                femaleQ.poll();
                femaleQ.poll();
                continue;
                //if (femaleQ.isEmpty()){
                 //   continue;
                //}
                //currentFemale = femaleQ.peek();
            }
            if (currentMale % 25 == 0){
                maleD.pop();
                maleD.pop();
                continue;
                //if (maleD.isEmpty()){
                    //continue;
                //}
                //currentMale = maleD.peek();

            }
            if (currentMale == currentFemale){
                countMatch++;
                maleD.pop();
                femaleQ.poll();

            }else {
                femaleQ.poll();
                if (currentMale-2 <= 0){
                    maleD.pop();
                    //maleD.push(0);
                }else {
                    maleD.push(maleD.pop() - 2);

                }


            }

        }
        System.out.printf("Matches: %d%n",countMatch);
        if (maleD.isEmpty()){
            System.out.printf("Males left: none%n");
        }else {
            System.out.print("Males left: ");
            for (Integer element : maleD) {
                if (maleD.size() > 1){
                    System.out.print(element+", ");
                }else {
                    System.out.println(element);

                }
                maleD.pop();

            }

        }
        if (femaleQ.isEmpty()){
            System.out.println("Females left: none");
        }else {
            System.out.print("Females left: ");
            for (Integer element : femaleQ) {
                if (femaleQ.size() > 1){
                    System.out.print(element+", ");
                }else {
                    System.out.println(element);
                }
                femaleQ.poll();

            }
        }

    }
}
