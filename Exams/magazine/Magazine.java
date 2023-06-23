package magazine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Magazine {

    private String type;
    private int capacity;
    private List<Cloth> data ;

    public Magazine(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }
    public void addCloth(Cloth cloth){
        if (this.data.size() < this.capacity) {
            this.data.add(cloth);
        }


    }
    public boolean removeCloth(String color){
        for (Cloth element : data) {
            if (element.getColor().equals(color)){
                this.data.remove(element);
                return true;
            }

        }
        return false;

    }
    public Cloth getSmallestCloth(){
       return this.data.stream().min(Comparator.comparing(Cloth::getSize)).orElse(null);


    }
    public Cloth getCloth(String color){
        for (Cloth element : data) {
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
        sb.append(String.format("%s magazine contains:",this.type)).append(System.lineSeparator());
        for (Cloth element : this.data) {
            sb.append(element.toString()).append(System.lineSeparator());

        }
        return sb.toString().trim();
    }

}
