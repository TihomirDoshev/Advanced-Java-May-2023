package kindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }
    public boolean addChild(Child child){
        if (this.registry.size() == this.capacity){
            return false;
        }else {
            this.registry.add(child);
            return true;
        }

    }
    public boolean removeChild(String firstName){
        for (Child child : this.registry) {
            if (child.getFirstName().equals(firstName)){
                this.registry.remove(child);
                return true;
            }
            
        }
        return false;
    }
    public int getChildrenCount(){
        return this.registry.size();

    }
    public Child getChild(String firstName){
        for (Child child : this.registry) {
            if (child.getFirstName().equals(firstName)){
                return child;
            }

        }
        return null;

    }
    public String registryReport(){
        List<Child> sorted = this.registry.stream().sorted(Comparator.comparing(Child::getAge).
                thenComparing(Child::getFirstName).thenComparing(Child::getLastName)).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Registered children in %s:",this.name));
        sb.append(System.lineSeparator());
        for (Child child : sorted) {
            sb.append("--").append(System.lineSeparator());
            sb.append(child.toString());
            sb.append(System.lineSeparator());

        }
        return sb.toString();
    }
}
