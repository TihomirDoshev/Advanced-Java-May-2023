package easterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {
    //•	material: String
    //•	capacity: int
    private List<Egg> data ;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }
    public void addEgg(Egg egg){
        if (this.data.size() < this.capacity){
            this.data.add(egg);

        }
    }
    public boolean removeEgg(String color){
        for (Egg element : this.data) {
            if (element.getColor().equals(color)){
                this.data.remove(element);
                return true;
            }

        }
        return false;

    }
    public Egg getStrongestEgg(){
        return this.data.stream().max(Comparator.comparing(Egg::getStrength)).orElse(null);
    }
    public Egg getEgg(String color){
        for (Egg element : this.data) {
            if (element.getColor().equals(color)){
                return element;
            }

        }
        return null;

    }
    public int getCount(){
        return this.data.size();
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s basket contains:",this.material)).trimToSize();
        sb.append(System.lineSeparator());
        for (Egg element : this.data) {
            sb.append(element);
            sb.append(System.lineSeparator());

        }
        return sb.toString().trim();
    }
}
