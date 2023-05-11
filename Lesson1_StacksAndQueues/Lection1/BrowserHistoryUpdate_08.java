package Advanced.Lesson1_StacksAndQueues.Lection1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpdate_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        ArrayDeque<String> queue = new ArrayDeque<>();

        String currentURL = null;

        String URL = scanner.nextLine();

        while (!URL.equals("Home")){
            if (URL.equals("back")){
                if(stack.isEmpty()){
                    System.out.println("no previous URLs");
                    URL = scanner.nextLine();
                    continue;
                }else {
                    queue.addFirst(currentURL);
                    currentURL = stack.pop();
                }
            }else if (URL.equals("forward")){
                if (queue.isEmpty()){
                    System.out.println("no next URLs");
                    URL = scanner.nextLine();
                    continue;
                }else {
                    currentURL = queue.poll();
                }
            }else {
                if (currentURL != null){
                    stack.push(currentURL);
                }
                currentURL = URL;
            }
            System.out.println(currentURL);
            URL = scanner.nextLine();
        }
    }
}
