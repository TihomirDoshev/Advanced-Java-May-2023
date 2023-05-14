package Advanced.Lesson1_StacksAndQueues.Lection1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();
        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        while (!url.equals("Home")){

            if (url.equals("back")){
                if (browserHistory.size() > 1){
                    browserHistory.pop();
                    System.out.println(browserHistory.peek());

                }else {
                    System.out.println("no previous URLs");

                }

            }else {
                browserHistory.push(url);
                System.out.println(browserHistory.peek());

            }


            url = scanner.nextLine();
        }

    }
}
