package Advanced.Lesson1_StacksAndQueues.Exercise1;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int num = Integer.parseInt(scanner.nextLine());
        //•	"1 X" - Push the element X into the stack.
        //•	"2" - Delete the element present at the top of the stack.
        //•	"3" - Print the maximum element in the stack.
        for (int i = 0; i < num; i++) {
            String  command = scanner.nextLine();

            if (command.split("\\s+")[0].equals("1")){
                stack.push(Integer.parseInt(command.split("\\s+")[1]));
            }else if (command.split("\\s+")[0].equals("2")){
                if (!stack.isEmpty()){
                    stack.pop();
                }

            }else if (command.split("\\s+")[0].equals("3")) {
                System.out.println(Collections.max(stack));
            }


        }
    }
}
