package Advanced.Lesson1_StacksAndQueues.Lection1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (queue.size() != 0) {
                    System.out.println("Canceled " + queue.peek());
                    queue.poll();
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {

                queue.offer(input);
            }

            input = scanner.nextLine();
        }

        for (String element : queue) {
            System.out.println(element);

        }


    }
}
