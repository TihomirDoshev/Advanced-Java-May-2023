package Advanced.Lesson_6_Defining_Classes.Lab_6.Constructors_02;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public  Car (){

    }

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        //The car is: Chevrolet unknown - -1 HP.
        builder.append("The car is: "+ getBrand()+" "+getModel()+" - "+getHorsePower()+" HP.");
        return builder.toString();
    }
}
