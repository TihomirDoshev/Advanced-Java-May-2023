package christmas;

public class Present {
    //•	name: String
    //•	weight: double
    //•	gender: String
    private String name;
    private double weight;
    private String gender;

    public Present(String name, double weight, String gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        //"Present {name} ({weight}) for a {gender}"
        return String.format("Present %s (%.2f) for a %s",this.name,this.weight,this.gender);
    }
}
