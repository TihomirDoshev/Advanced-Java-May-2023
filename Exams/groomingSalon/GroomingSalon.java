package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    //•	capacity: int
    //List<Pet> data
    private int capacity;
    private List<Pet> data;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }
    public void add(Pet pet){
        if (this.data.size() < this.capacity){
            this.data.add(pet);
        }
    }
    public boolean remove(String name){
        for (Pet element : this.data) {
            if (element.getName().equals(name)){
                this.data.remove(element);
                return true ;
            }
        }
        return false ;
    }
    public Pet getPet(String name, String owner){
        for (Pet element : this.data) {
            if (element.getName().equals(name) && element.getOwner().equals(owner)){
                return element;
            }
        }
        return null;
    }
    public int getCount(){
        return this.data.size();
    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The grooming salon has the following clients:");
        sb.append(System.lineSeparator());
        for (Pet element : this.data) {
            sb.append(String.format("%s %s",element.getName(),element.getOwner()));
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
