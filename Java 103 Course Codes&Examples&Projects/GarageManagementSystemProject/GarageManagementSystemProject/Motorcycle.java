package GarageManagementSystemProject;

public class Motorcycle extends Vehicle {
    private int engineCapacity;
    private int gear;

    // Constructor
    public Motorcycle(String ownerName, String model, String brand, int year,
                      String countryOfManufacture, String color,
                      int engineCapacity, int gear) {
        super(ownerName, model, brand, year, countryOfManufacture, color);
        this.engineCapacity = engineCapacity;
        this.gear = gear;
    }

    // Getters & Setters
    public int getEngineCapacity() { return engineCapacity; }
    public void setEngineCapacity(int engineCapacity) { this.engineCapacity = engineCapacity; }

    public int getGear() { return gear; }
    public void setGear(int gear) { this.gear = gear; }

    // Overridden displayInfo() method
    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Details:");
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Model: " + getModel());
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
        System.out.println("Country of Manufacture: " + getCountryOfManufacture());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Gear: " + gear);
    }
}
