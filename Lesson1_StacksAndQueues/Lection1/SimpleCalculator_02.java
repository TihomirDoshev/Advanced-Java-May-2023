package Advanced.Lesson1_StacksAndQueues.Lection1;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");
        ArrayDeque <String> inputDeque = new ArrayDeque<>();
        Collections.addAll(inputDeque,input);

        while(inputDeque.size() > 1){
            int firstNum = Integer.parseInt(inputDeque.pop());
            String symbol = inputDeque.pop();
            int secondNum = Integer.parseInt(inputDeque.pop());
            int result = 0;

            if (symbol.equals("+")){
                result = firstNum + secondNum;


            }else if (symbol.equals("-")){
                result = firstNum - secondNum;

            }
            inputDeque.push(String.valueOf(result));
        }
        System.out.println(inputDeque.peek());


    }
}
