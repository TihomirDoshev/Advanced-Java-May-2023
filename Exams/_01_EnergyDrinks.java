package Advanced.Exams;

import java.util.*;

public class _01_EnergyDrinks {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

        int [] caffeinе =Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] energy =Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> caffeineD = new ArrayDeque<>();
        Queue<Integer> energyQ = new ArrayDeque<>();

        Arrays.stream(caffeinе).forEach(caffeineD::push);
        Arrays.stream(energy).forEach(energyQ::offer);

        int stamatEnergy = 0;

        //1, 16, 8, 14, 5
        //27, 23


        while (!caffeineD.isEmpty() && !energyQ.isEmpty()){
            int currentCaffeine = caffeineD.peek();
            int currentEnergy = energyQ.peek();
            int currentMix = currentCaffeine * currentEnergy ;

            if (currentMix + stamatEnergy <= 300){
//                if (stamatEnergy + currentMix >=300){
//                    System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
//                    System.out.printf("Stamat is going to sleep with %d mg caffeine.",stamatEnergy);
//                    return;
//
//
//                }
                caffeineD.pop();
                energyQ.poll();
                stamatEnergy+=currentMix;



            }else if (currentMix + stamatEnergy > 300){
                caffeineD.pop();
                energyQ.offer(energyQ.poll());
                stamatEnergy -= 30;
                if (stamatEnergy < 0 ){
                    stamatEnergy = 0;
                }
            }



        }
        if (!energyQ.isEmpty()) {
            if (stamatEnergy < 300) {
                System.out.print("Drinks left: ");
                for (Integer element : energyQ) {
                    if (energyQ.size() > 1) {
                        System.out.print(element + ", ");

                    } else {
                        System.out.print(element);
                    }
                    energyQ.poll();

                }
                System.out.println();
                System.out.printf("Stamat is going to sleep with %d mg caffeine.",stamatEnergy);
            }

            }else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
            System.out.printf("Stamat is going to sleep with %d mg caffeine.",stamatEnergy);

        }
        }
    }

