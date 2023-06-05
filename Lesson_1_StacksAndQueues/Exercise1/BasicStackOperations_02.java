package Advanced.Lesson1_StacksAndQueues.Exercise1;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String [] n = scanner.nextLine().split("\\s+");
        int countOfNumbers = Integer.parseInt(n[0]);
        int numbersToPop = Integer.parseInt(n[1]);
        int searchingNum = Integer.parseInt(n[2]);

        String [] numbers = scanner.nextLine().split("\\s+");

        for (int i = 0; i < countOfNumbers; i++) {
            int currentNum = Integer.parseInt(numbers[i]);
            stack.push(currentNum);

        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        }else if (stack.contains(searchingNum)){
            System.out.println("true");
        }else {
            System.out.println(Collections.min(stack));
        }


    }
}
