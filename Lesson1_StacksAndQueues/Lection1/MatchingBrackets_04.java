package Advanced.Lesson1_StacksAndQueues.Lection1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();

        ArrayDeque <Integer> stack = new ArrayDeque<>();

        for (int i = 0 ; i <input.length()   ; i++) {
            char currentChar = input.charAt(i);


            if (currentChar == '('){
                stack.push(i);

            }else if (currentChar ==  ')'){
                int startIndex = stack.pop();
                int stopIndex = i;

                String newText = input.substring(startIndex,stopIndex +1);

                System.out.println(newText);




            }

        }

    }
}
