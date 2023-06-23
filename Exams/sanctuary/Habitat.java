package sanctuary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Habitat {
    private int capacity;
    private List<Elephant> data;

    public Habitat(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Elephant elephant) {
        if (this.data.size() < this.capacity) {
            this.data.add(elephant);
        }
    }

    public boolean remove(String name) {
        for (Elephant element : this.data) {
            if (element.getName().equals(name)) {
                this.data.remove(element);
                return true;
            }


        }
        return false;

    }

    public Elephant getElephant(String retiredFrom) {
        return this.data.stream().filter(e -> e.getRetiredFrom().equals(retiredFrom)).findFirst().orElse(null);
    }

    public Elephant getOldestElephant() {
        return this.data.stream().max(Comparator.comparing(Elephant::getAge)).orElse(null);
    }

    public int getAllElephants(){
        return this.data.size();
    }

    public String getReport() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Saved elephants in the park:"));
        sb.append(System.lineSeparator());
        for (Elephant element : this.data) {
            sb.append(String.format("%s came from: %s",element.getName(),element.getRetiredFrom()));
            sb.append(System.lineSeparator());

        }
        return sb.toString().trim();


    }

}
