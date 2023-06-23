package Advanced.Exams;

import java.util.*;

public class _01_SantaPresentFactory2 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
       int [] materials =Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
       int [] magic =Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

       Deque<Integer> materialD = new ArrayDeque<>();
       Queue<Integer> magicQ  = new ArrayDeque<>();

        Arrays.stream(materials).forEach(materialD::push);
        Arrays.stream(magic).forEach(magicQ::offer);

        Map<String,Integer> map = new TreeMap<>();
        map.put("Doll",0);
        map.put("Wooden train",0);
        map.put("Teddy bear",0);
        map.put("Bicycle",0);


        while (!materialD.isEmpty() && !magicQ.isEmpty()){
            int currentMatD = materialD.peek();
            int currentMagQ = magicQ.peek();
            int multiply = currentMatD * currentMagQ ;

            //Doll	150
            //Wooden train	250
            //Teddy bear	300
            //Bicycle 	400

            if (multiply == 150){
                map.put("Doll",map.get("Doll") + 1);
                materialD.pop();
                magicQ.poll();

            }else if (multiply == 250){
                map.put("Wooden train",map.get("Wooden train") + 1);
                materialD.pop();
                magicQ.poll();

            }else if (multiply == 300){
                map.put("Teddy bear",map.get("Teddy bear") + 1);
                materialD.pop();
                magicQ.poll();

            }else if (multiply == 400){
                map.put("Bicycle",map.get("Bicycle") + 1);
                materialD.pop();
                magicQ.poll();

            }else if (multiply < 0){
                int sum = currentMagQ + currentMatD;
                magicQ.poll();
                materialD.pop();
                materialD.push(sum);
            }else if (multiply > 0 ){
                //remove  only the magic value and increase the material value by 15.
                magicQ.poll();
                materialD.push(materialD.pop() + 15 );
            }else {
                if (currentMagQ == 0){
                    magicQ.poll();
                }
                if (currentMatD == 0){
                    materialD.pop();
                }

            }




        }
        if (map.get("Doll") > 0 && map.get("Wooden train") > 0){
            System.out.println("The presents are crafted! Merry Christmas!");
        }else if (map.get("Teddy bear") > 0 && map.get("Bicycle") > 0){
            System.out.println("The presents are crafted! Merry Christmas!");

        }else {
            System.out.println("No presents this Christmas!");
        }
        if (!materialD.isEmpty()){
            System.out.print("Materials left: ");
            while (!materialD.isEmpty()){
                if (materialD.size() > 1 ){
                    System.out.print(materialD.pop() + ", ");
                }else {
                    System.out.println(materialD.pop());
                }
            }


        }
        if (!magicQ.isEmpty()){
            System.out.print("Magic left: ");
            while (!magicQ.isEmpty()){
                if (magicQ.size() > 1 ){
                    System.out.print(magicQ.poll() + ", ");
                }else {
                    System.out.println(magicQ.poll());
                }
            }


        }
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            if (element.getValue() > 0){
                System.out.printf("%s: %d%n",element.getKey(),element.getValue());
            }

        }



    }
}
