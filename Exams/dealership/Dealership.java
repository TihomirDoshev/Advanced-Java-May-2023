package dealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    //•	name: String
    //•	capacity: int
    //List<car> data

    private String name;
    private int capacity;
    private List<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }
    public void add(Car car){
        if (this.data.size()<this.capacity){
            this.data.add(car);
        }
    }
    public boolean buy(String manufacturer, String model){
        for (Car element : this.data) {
            if (element.getManufacturer().equals(manufacturer) && element.getModel().equals(model)){
                this.data.remove(element);
                return true;
            }
        }
        return false;
    }
    public Car getLatestCar(){
        return this.data.stream().max(Comparator.comparing(Car::getYear)).orElse(null);
    }
    public Car getCar(String manufacturer, String model){
        for (Car element : this.data) {
            if (element.getManufacturer().equals(manufacturer) && element.getModel().equals(model)){
                return element;
            }

        }
        return null;

    }
    public int getCount(){
        return this.data.size();
    }
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(" The cars are in a car dealership %s:", this.name));
        sb.append(System.lineSeparator());
        for (Car element : this.data) {
            sb.append(element);
            sb.append(System.lineSeparator());

        }
        return sb.toString().trim();



    }
}
