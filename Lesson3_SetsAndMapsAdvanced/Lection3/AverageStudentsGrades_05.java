package Advanced.Lesson3_SetsAndMapsAdvanced.Lection3;

import java.util.*;

public class AverageStudentsGrades_05 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> map = new TreeMap<>();


        for (int i = 0; i < num; i++) {
            String [] currentStudent  = scanner.nextLine().split("\\s+");
            String name = currentStudent[0];
            double grade = Double.parseDouble(currentStudent[1]);

            if (!map.containsKey(name)){
                map.put(name,new ArrayList<>());
                map.get(name).add(grade);
            }else {
                map.get(name).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> element : map.entrySet()) {
            double sum = 0;
            System.out.printf("%s -> ",element.getKey());
            for (int i = 0; i < element.getValue().size(); i++) {
                double currentNum = element.getValue().get(i);
                sum = sum + currentNum;
                System.out.printf("%.2f ",element.getValue().get(i));
            }
            System.out.printf("(avg: %.2f)%n",sum/element.getValue().size());

        }
    }
}
