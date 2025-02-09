package VehicleExample;
public class Vehicle {
    protected String brand;
    protected String model;
    protected int speed;
    public Vehicle(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand + "\nModel: "
                + model + "\nSpeed: " + speed + " km/h");

    }
}
