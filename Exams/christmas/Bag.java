package christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bag {
    //List<Present> data
    //•	color: String
    //•	capacity: int

    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data =  new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }
    public int count(){
        return this.data.size();
    }
    public void add(Present present){
        if (this.data.size() < this.capacity){
            this.data.add(present);
        }
    }
    public boolean remove(String name){
        for (Present element : this.data) {
            if (element.getName().equals(name)){
                this.data.remove(element);
                    return true;

            }

        }
        return false;
    }
    public Present heaviestPresent(){
        return this.data.stream().max(Comparator.comparing(Present::getWeight)).orElse(null);

    }
    public Present getPresent(String name){
        for (Present element : this.data) {
            if (element.getName().equals(name)){
                return element;
            }
        }
        return null;
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s bag contains:",this.color));
        sb.append(System.lineSeparator());
        for (Present element : this.data) {
            sb.append(element);
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

}
