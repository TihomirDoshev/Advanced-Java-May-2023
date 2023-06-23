package Advanced.Exams;

import java.util.*;

public class _01_SantaPresentFactory {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int [] materials = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] magic  = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> materialsD =new ArrayDeque<>();
        Queue<Integer> magicQ = new ArrayDeque<>();

        Map<String,Integer> map = new TreeMap<>();
        map. put("Doll",0);
        map. put("Wooden train",0);
        map. put("Teddy bear",0);
        map. put("Bicycle",0);

        Arrays.stream(materials).forEach(materialsD::push);
        Arrays.stream(magic).forEach(magicQ::offer);

        while (!materialsD.isEmpty() && !magicQ.isEmpty()){
            int currentMaterial =  materialsD.peek();
            int currentMagic = magicQ.peek();
            int currentResult = currentMagic * currentMaterial;

            //Doll 	150
            //Wooden train 	250
            //Teddy bear 	300
            //Bicycle  	400

            if (currentResult == 150){
                map. put("Doll",map.get("Doll") + 1 );
                materialsD.pop();
                magicQ.poll();

            }else if (currentResult == 250){
                map. put("Wooden train",map.get("Wooden train") + 1 );
                materialsD.pop();
                magicQ.poll();

            }else if (currentResult == 300) {
                map.put("Teddy bear", map.get("Teddy bear") + 1);
                materialsD.pop();
                magicQ.poll();

            } else if (currentResult == 400) {
                map.put("Bicycle", map.get("Bicycle") + 1);
                materialsD.pop();
                magicQ.poll();

            }else if (currentResult < 0){
                //materials.
                int sum = currentMaterial + currentMagic ;
                materialsD.pop();
                magicQ.poll();
                materialsD.push(sum);

            }else if (currentResult > 0){
                //remove only the magic value and increase the material value by 15.
                magicQ.poll();
                materialsD.push(materialsD.pop() + 15);

            }else {
                if (currentMagic == 0){
                    magicQ.poll();
                }
                if (currentMaterial == 0){
                    materialsD.pop();
                }
            }

        }
        //a doll and a train or a teddy bear and a bicycle
        boolean isDollAndTrain = map.get("Doll") > 0 && map.get("Wooden train") >0 ;
        boolean isBearAndBicycle = map.get("Teddy bear") > 0 && map.get("Bicycle") >0 ;

        if (isDollAndTrain || isBearAndBicycle){
            System.out.println("The presents are crafted! Merry Christmas!");
        }else {
            System.out.println("No presents this Christmas!" );
        }

        if (!materialsD.isEmpty()){
            System.out.print("Materials left: ");
            System.out.println(materialsD.toString().replace("[","").replace("]",""));
        }
        if (!magicQ.isEmpty()){
            System.out.print("Magic left: ");
            System.out.println(magicQ.toString().replace("[","").replace("]",""));

        }
        for (Map.Entry<String, Integer> element : map.entrySet()) {

            if (element.getValue() > 0){
                System.out.println(element.getKey()+": "+element.getValue());
            }

        }



    }
}
