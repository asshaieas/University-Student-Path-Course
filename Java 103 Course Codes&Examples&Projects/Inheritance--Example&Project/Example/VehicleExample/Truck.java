package VehicleExample;

public class Truck extends Vehicle{
    protected double cargoCapacity;
    public Truck(String brand, String model, int speed, double cargoCapacity) {
        super(brand, model, speed);
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + "\n");
    }
}
