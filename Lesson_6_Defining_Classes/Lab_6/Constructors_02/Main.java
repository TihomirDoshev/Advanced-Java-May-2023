package Advanced.Lesson_6_Defining_Classes.Lab_6.Constructors_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {

            String [] carInfo = scanner.nextLine().split("\\s+");

            Car car = new Car();

            if (carInfo.length == 3){
                String brand = carInfo[0];
                String model = carInfo[1];
                int hp = Integer.parseInt(carInfo[2]);
                car = new Car(brand,model,hp);


            }else {
                String brand = carInfo[0];
                car = new Car(brand);
            }
            System.out.println(car.toString());

        }
    }
}
