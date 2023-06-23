package Advanced.Exams;

import java.util.*;

public class _01_ApocalypsePreparation {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int [] textilesArr  = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int [] medicamentArr  = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Queue<Integer> textileQ = new ArrayDeque<>();
        Deque<Integer> medicamentD = new ArrayDeque<>();

        Arrays.stream(textilesArr).forEach(textileQ::offer);
        Arrays.stream(medicamentArr).forEach(medicamentD::push);

        Map<String,Integer> map = new TreeMap<>();




        while (!textileQ.isEmpty() && !medicamentD.isEmpty()){
            int currentTextile =  textileQ.peek();
            int currentMedicament = medicamentD.peek();
            int sum = currentMedicament + currentTextile;

            if (sum == 30){
                if (!map.containsKey("Patch")){
                    map.put("Patch",1);

                }else {
                    map.put("Patch",map.get("Patch")+1);
                }
                textileQ.poll();
                medicamentD.pop();
            } else if (sum == 40) {
                if (!map.containsKey("Bandage")){
                    map.put("Bandage",1);

                }else {
                    map.put("Bandage",map.get("Bandage")+1);
                }
                textileQ.poll();
                medicamentD.pop();


            } else if (sum == 100) {
                if (!map.containsKey("MedKit")){
                    map.put("MedKit",1);

                }else {
                    map.put("MedKit",map.get("MedKit")+1);
                }
                textileQ.poll();
                medicamentD.pop();


            } else if (sum > 100) {
                if (!map.containsKey("MedKit")){
                    map.put("MedKit",1);

                }else {
                    map.put("MedKit",map.get("MedKit")+1);
                }
                int diff = sum - 100;
                textileQ.poll();
                medicamentD.pop();

                medicamentD.push(medicamentD.pop() + diff);


            }else {
                textileQ.poll();
                medicamentD.push(medicamentD.pop()+10);
            }



        }
        if (textileQ.isEmpty() && medicamentD.isEmpty()){
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textileQ.isEmpty()) {
            System.out.println("Textiles are empty.");

        }else {
            System.out.println("Medicaments are empty.");
        }

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey()+" - "+e.getValue()));

        if (!textileQ.isEmpty()){
            System.out.print("Textiles left: ");
            for (Integer q : textileQ) {
                if (textileQ.size() > 1){
                    System.out.printf("%d, ",q);
                }else {
                    System.out.println(q);
                }
                textileQ.poll();

            }
        } else if (!medicamentD.isEmpty()) {
            System.out.print("Medicaments left: ");
            for (Integer d : medicamentD) {
                if (medicamentD.size() > 1){
                    System.out.printf("%d, ",d);
                }else {
                    System.out.println(d);
                }
                medicamentD.pop();

            }

        }


    }
}
