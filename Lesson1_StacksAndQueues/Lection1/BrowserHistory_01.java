package Advanced.Lesson1_StacksAndQueues.Lection1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String current = "";

        String command = scanner.nextLine();

        while (!command.equals("Home")) {

            if (command.equals("back")) {

                if (!history.isEmpty()) {

                    current = history.pop();
                }

                else {
                    System.out.println("no previous URLs");

                    command = scanner.nextLine();
                    continue;
                }
            }

            else {
                if (!current.equals("")) {

                    history.push(current);

                }
                current = command;

            }

            System.out.println(current);
            command = scanner.nextLine();
        }

    }
}
