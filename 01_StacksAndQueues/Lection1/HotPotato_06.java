package Advanced.Lesson1_StacksAndQueues.Lection1;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");
        int rotations = Integer.parseInt(scanner.nextLine());
        ArrayDeque <String> childrenQueue = new ArrayDeque<>();
        Collections.addAll(childrenQueue,input);

        while (childrenQueue.size() > 1){

            for (int i = 1; i < rotations; i++) {
                String currentChild = childrenQueue.poll();
                childrenQueue.offer(currentChild);

            }
            System.out.println("Removed "+ childrenQueue.poll());

        }
        System.out.println("Last is "+childrenQueue.peek());
        }

    }

