package Advanced.Exams;

import java.util.*;

public class _01_RubberDuckDebuggers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] queueProgrammer  = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] dequeTask  = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Queue<Integer> programmerQueue=   new ArrayDeque<>();

        Deque<Integer> taskDeque = new ArrayDeque<>();

        for (int i = 0; i < queueProgrammer.length; i++) {
            int currentNum = queueProgrammer[i];
            programmerQueue.offer(currentNum);

            
        }
        Arrays.stream(dequeTask).forEach(taskDeque::push);

        Map<String,Integer> duck = new LinkedHashMap<>();
        //0 - 60
        duck.put("Darth Vader Ducky",0);
        //61 – 120
        duck.put("Thor Ducky",0);
        //121 - 180
        duck.put("Big Blue Rubber Ducky",0);
        //181 - 240
        duck.put("Small Yellow Rubber Ducky",0);

        while (!taskDeque.isEmpty() && !programmerQueue.isEmpty()){
            int task = programmerQueue.peek();
            int time = taskDeque.peek();
            int neededTime = task * time;

            if (neededTime > 0 && neededTime <= 60){
                duck.put("Darth Vader Ducky", duck.get("Darth Vader Ducky")+1);
                programmerQueue.poll();
                taskDeque.pop();

            }else if (neededTime >60 && neededTime<=120){
                duck.put("Thor Ducky", duck.get("Thor Ducky")+1);
                programmerQueue.poll();
                taskDeque.pop();

            }else if (neededTime > 120 && neededTime <= 180){
                duck.put("Big Blue Rubber Ducky",duck.get("Big Blue Rubber Ducky")+1);
                programmerQueue.poll();
                taskDeque.pop();

            }else if (neededTime>180 && neededTime <=240){
                duck.put("Small Yellow Rubber Ducky",duck.get("Small Yellow Rubber Ducky")+1);
                programmerQueue.poll();
                taskDeque.pop();
            }else {

                programmerQueue.offer(programmerQueue.poll());
                taskDeque.push(taskDeque.pop()-2);
            }


        }
        System.out.println("Congratulations, all tasks have been completed! Rubber ducks rewarded:");
        for (Map.Entry<String, Integer> entry : duck.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());

        }


    }
}
