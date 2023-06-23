package bakery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bakery {
    //•	name: String
    //•	capacity: int
    //•	Field employees – List that holds added Employees

    private String name;
    private int capacity;
    private List<Employee> employees;

    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();

    }
    public void add(Employee employee){
        if (this.employees.size() < this.capacity){
            this.employees.add(employee);
        }
    }
    public boolean remove(String name){
        for (Employee element : this.employees) {
            if (element.getName().equals(name)){
                this.employees.remove(element);
                return true;
            }

        }
        return false;
    }
    public Employee getOldestEmployee(){
        return this.employees.stream().max(Comparator.comparing(Employee::getAge)).orElse(null);
    }
    public Employee getEmployee(String name){
        for (Employee element : this.employees) {
            if (element.getName().equals(name)){
                return element;
            }

        }
        return null;

    }
    public int getCount(){
        return this.employees.size();
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Employees working at Bakery %s:",this.name));
        sb.append(System.lineSeparator());
        for (Employee element : this.employees) {
            sb.append(element);
            sb.append(System.lineSeparator());

        }
        return sb.toString().trim();

    }

}
