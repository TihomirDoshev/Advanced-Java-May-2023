package Advanced.Exams;

import java.util.*;
import java.util.stream.Collectors;

public class Exam_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] tools = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] substances = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<Integer> challenges = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Queue<Integer> toolsQueue = new ArrayDeque<>();
        Deque<Integer> substancesDeque = new ArrayDeque<>();

        Arrays.stream(tools).forEach(toolsQueue :: offer);
        Arrays.stream(substances).forEach(substancesDeque :: push);


        while (!toolsQueue.isEmpty() && !substancesDeque.isEmpty()) {
            int currentTool = toolsQueue.peek();
            int currentSubstances = substancesDeque.peek();
            int result = currentSubstances * currentTool;

            if (challenges.contains(result)) {
                toolsQueue.poll();
                substancesDeque.pop();
                challenges.remove(Integer.valueOf(result));
            } else {
                toolsQueue.offer(currentTool + 1);
                toolsQueue.poll();
                if (currentSubstances - 1 <= 0) {
                    substancesDeque.pop();
                } else {
                    substancesDeque.pop();
                    substancesDeque.push(currentSubstances - 1);
                }
            }
        }
        if (challenges.size() > 0) {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        } else {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        }

        if (!toolsQueue.isEmpty()) {
            System.out.print("Tools: ");
            for (Integer element : toolsQueue) {
                if (toolsQueue.size() > 1) {
                    System.out.print(element + ", ");
                } else {
                    System.out.println(element);
                }
                toolsQueue.poll();

            }
        }
        if (!substancesDeque.isEmpty()) {
            System.out.print("Substances: ");
            for (Integer element : substancesDeque) {
                if (substancesDeque.size() > 1) {
                    System.out.print(element + ", ");
                } else {
                    System.out.println(element);
                }
                substancesDeque.pop();

            }
        }

        if (!challenges.isEmpty()) {
            System.out.print("Challenges: ");
            for (int i = 0; i < challenges.size(); i++) {
                if (challenges.size() - i > 1) {
                    System.out.print(challenges.get(i) + ", ");
                } else {
                    System.out.println(challenges.get(i));
                }
            }
        }

        }
    }
