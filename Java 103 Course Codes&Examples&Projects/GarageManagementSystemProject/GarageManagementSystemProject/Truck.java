package GarageManagementSystemProject;

public class Truck extends Vehicle {
    private int loadCapacity;

    // Constructor
    public Truck(String ownerName,String model, String brand, int year,
                 String countryOfManufacture, String color, int loadCapacity) {
        super(ownerName, model, brand, year, countryOfManufacture, color);
        this.loadCapacity = loadCapacity;
    }

    // Getters & Setters
    public int getLoadCapacity() { return loadCapacity; }
    public void setLoadCapacity(int loadCapacity) { this.loadCapacity = loadCapacity; }

    // Overridden displayInfo() method
    @Override
    public void displayInfo() {
        System.out.println("Truck Details:");
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Model: " + getModel());
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
        System.out.println("Country of Manufacture: " + getCountryOfManufacture());
        System.out.println("Color: " + getColor());
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}
