package Advanced.Exams;

import java.util.*;

public class _01_KAT {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);

        long [] plates  = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToLong(Long::parseLong).toArray();
        long [] cars  = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToLong(Long::parseLong).toArray();

        Queue<Long> platesQ = new ArrayDeque<>();
        Deque<Long> carsD = new ArrayDeque<>();

        Arrays.stream(plates).forEach(platesQ::offer);
        Arrays.stream(cars).forEach(carsD::push);

        int days = 0;
        int registeredCars = 0;

        while (!platesQ.isEmpty() && !carsD.isEmpty()){
            days++;
            long carWithoutPlates = 0;
            long remainPlates = 0;

            long currentPlates = platesQ.peek();
            long currentCars = carsD.peek();


            if (currentPlates / 2 == currentCars){
                registeredCars += currentCars;
                platesQ.poll();
                carsD.pop();

            } else if (currentPlates /2  > currentCars) {
                remainPlates = (currentPlates/2) - currentCars;
                registeredCars += currentCars;
                platesQ.poll();
                carsD.pop();
                platesQ.offer(remainPlates*2);



            } else if (currentPlates /2 < currentCars) {

                carWithoutPlates = currentCars - (currentPlates/2);
                registeredCars += currentPlates / 2;
                platesQ.poll();
                carsD.pop();
                carsD.addLast(carWithoutPlates);


            }
        }
        System.out.printf("%d cars were registered for %d days!%n",registeredCars,days);
        if (!platesQ.isEmpty()){
            long sumPlate = 0;
            while (!platesQ.isEmpty()){
                sumPlate+=platesQ.poll();
            }
            System.out.printf("%d license plates remain!%n",sumPlate);
        } else if (!carsD.isEmpty()) {
            long sumCars = 0;
            while (!carsD.isEmpty()){
                sumCars+=carsD.pop();
            }
            System.out.printf("%d cars remain without license plates!%n",sumCars);


        }else {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }

    }


}
