package Advanced.Lesson_6_Defining_Classes.Lab_6.Car_Info_01;

public class Car {
    //•	Brand: String
    //•	Model: String
    //•	Horsepower: int

    private String brand;
    private String model;
    private int horsePower;

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
    public String toString() {
        StringBuilder builder = new StringBuilder();
        //The car is: Chevrolet Impala - 390 HP.
        builder.append("The car is: "+brand+" "+model+" "+"- "+horsePower+" HP.");
        return builder.toString();


    }
}
