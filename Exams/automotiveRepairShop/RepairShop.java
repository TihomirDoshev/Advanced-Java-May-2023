package automotiveRepairShop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RepairShop {


    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();

    }
    public void addVehicle(Vehicle vehicle){
        if (this.vehicles.size()<this.capacity){
            this.vehicles.add(vehicle);
        }
    }
    public boolean removeVehicle(String vin){
        for (Vehicle element : this.vehicles) {
            if (element.getVIN().equals(vin)){
                this.vehicles.remove(element);
                return true;
            }

        }
        return false;
    }
    public int getCount(){
        return this.vehicles.size();
    }
    public Vehicle getLowestMileage(){
        return this.vehicles.stream().min(Comparator.comparing(Vehicle::getMileage)).orElse(null);
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicles in the preparatory:");
        sb.append(System.lineSeparator());
        for (Vehicle element : this.vehicles) {
            sb.append(element);
            sb.append(System.lineSeparator());

        }
        return sb.toString().trim();
    }
}
