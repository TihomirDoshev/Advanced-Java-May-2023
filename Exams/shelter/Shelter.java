package shelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {

    private int capacity;
    private List<Animal> data;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data =  new ArrayList<>();

    }
    public void add(Animal animal){
        if (this.data.size() < this.capacity){
            this.data.add(animal);
        }
    }
    public boolean remove(String name){
        for (Animal element : this.data) {
            if (element.getName().equals(name)){
                this.data.remove(element);
                return true;
            }

        }
        return false;
    }
    public  Animal getAnimal(String name, String caretaker){
        for (Animal element : this.data) {
            if (element.getName().equals(name) && element.getCaretaker().equals(caretaker)){
                return element;
            }

        }
        return null;
    }
    public Animal getOldestAnimal(){
        return this.data.stream().max(Comparator.comparing(Animal::getAge)).orElse(null);
    }
    public int getCount(){
        return this.data.size();
    }
    public String 	getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The shelter has the following animals:"));
        sb.append(System.lineSeparator());
        for (Animal element : this.data) {
            sb.append(String.format("%s %s",element.getName(),element.getCaretaker()));
            sb.append(System.lineSeparator());

        }
        return sb.toString().trim();
    }
}
