package Advanced.Lesson_6_Defining_Classes.Lab_6.Car_Info_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String [] carDetail = scanner.nextLine().split("\\s+");
            String brand = carDetail[0];
            String model = carDetail[1];
            int horsePower = Integer.parseInt(carDetail[2]);

            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);

            System.out.println(car.toString());
        }
    }






}
