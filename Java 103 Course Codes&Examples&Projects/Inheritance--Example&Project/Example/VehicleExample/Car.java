package VehicleExample;

public class Car extends Vehicle{
    protected int numDoors;
    public Car(String brand, String model, int speed, int numDoors) {
        super(brand, model, speed);
        this.numDoors = numDoors;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors + "\n");
    }
}
