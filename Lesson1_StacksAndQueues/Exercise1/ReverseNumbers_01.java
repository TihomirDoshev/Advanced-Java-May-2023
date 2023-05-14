package Advanced.Lesson1_StacksAndQueues.Exercise1;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = Integer.parseInt(numbers[i]);
            numbersStack.push(currentNumber);

        }
        for (Integer element : numbersStack) {
            System.out.print(element+" ");

        }

    }
}
