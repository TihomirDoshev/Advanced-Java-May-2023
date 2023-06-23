package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> roster;
    //•	name: String
    //•	capacity: int
    private String name ;
    private int capacity;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }
    public void add(Person person){
        if (this.roster.size()< this.capacity){
            this.roster.add(person);
        }
    }
    public boolean remove(String name){
        for (Person element : this.roster) {
            if (element.getName().equals(name)){
                this.roster.remove(element);
                return true;
            }

        }
        return false;
    }
    public Person getPerson(String name, String hometown){
        for (Person element : this.roster) {
            if (element.getName().equals(name) && element.getHometown().equals(hometown)){
                return element;
            }

        }
        return null;
    }
    public int getCount(){
        return this.roster.size();
    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The people in the hotel %s are:",this.name));
        sb.append(System.lineSeparator());
        for (Person element : this.roster) {
            sb.append(element);
            sb.append(System.lineSeparator());

        }
        return sb.toString().trim();

    }
}
