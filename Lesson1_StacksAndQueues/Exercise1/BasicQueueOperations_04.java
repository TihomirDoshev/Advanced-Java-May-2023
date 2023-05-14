package Advanced.Lesson1_StacksAndQueues.Exercise1;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        String [] inputArr = scanner.nextLine().split("\\s+");
        int numberCount = Integer.parseInt(inputArr[0]);
        int numberToPop = Integer.parseInt(inputArr[1]);
        int numberToFind = Integer.parseInt(inputArr[2]);

        String [] numbers = scanner.nextLine().split("\\s+");

        for (int i = 0; i < numberCount; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i < numberToPop; i++) {
            queue.poll();
        }
        if (queue.isEmpty()){
            System.out.println(0);

        }else if (queue.contains(numberToFind)) {
            System.out.println("true");

        }else {
            System.out.println(Collections.min(queue));
        }
    }
}
