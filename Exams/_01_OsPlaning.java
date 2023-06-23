package Advanced.Exams;

import java.util.*;

public class _01_OsPlaning {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] tasks  = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] threads   = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> tasksD= new ArrayDeque<>();
        Queue<Integer> threadsQ = new ArrayDeque<>();

        Arrays.stream(tasks).forEach(tasksD::push);
        Arrays.stream(threads).forEach(threadsQ::offer);

        int killNum = Integer.parseInt(scanner.nextLine());

        while (!tasksD.isEmpty() && !threadsQ.isEmpty()){
            int currentTaskD = tasksD.peek();
            int currentThreadQ =  threadsQ.peek();


            if (currentTaskD == killNum){
                //Thread with value 20
                // killed task 54
                System.out.printf("Thread with value %d killed task %d%n",currentThreadQ,killNum);

                while (!threadsQ.isEmpty()){
                    if (threadsQ.size()> 1){
                        System.out.print(threadsQ.poll()+" ");

                    }else {
                        System.out.println(threadsQ.poll());

                    }
                }

            }else if (currentThreadQ >= currentTaskD){
                threadsQ.poll();
                tasksD.pop();
            }else{
                threadsQ.poll();
            }
        }

    }
}
