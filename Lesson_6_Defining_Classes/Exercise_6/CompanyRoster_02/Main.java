package Advanced.Lesson_6_Defining_Classes.Exercise_6.CompanyRoster_02;

import Foundamentals.Lesson6_ObjectsAndClasses.MoreExercise6.CompanyRoster_01;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Department> departments = new HashMap<String, Department>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            Employee employee;
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            //6 parameters
            if(input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary, position,department, email, age);
            }
            //4 parameters
            else if (input.length == 4) {
                employee = new Employee(name, salary, position, department);
            }

            else {
                try {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException e) {
                    String email = input[4];
                    employee = new Employee(name, salary, position, department, email);
                }
            }


            departments.putIfAbsent(department, new Department(department));
            departments.get(department).getEmployees().add(employee);
        }



        Department maxAverageSalaryDepartment  = departments.entrySet()
                .stream()

                .max(Comparator.comparingDouble(entry -> entry.getValue().getAverageSalary()))

                .get()

                .getValue();

        System.out.println("Highest Average Salary: " + maxAverageSalaryDepartment.getName());
        maxAverageSalaryDepartment.getEmployees()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(employee -> System.out.println(employee.toString()));
    }
}
