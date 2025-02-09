package GarageManagementSystemProject;

public class Car extends Vehicle {
    private int seatCapacity;
    private int numberOfDoors;

    // Constructor
    public Car(String ownerName, String model, String brand, int year,
               String countryOfManufacture, String color,
               int seatCapacity, int numberOfDoors) {
        super(ownerName, model, brand, year, countryOfManufacture, color);
        this.seatCapacity = seatCapacity;
        this.numberOfDoors = numberOfDoors;
    }

    // Getters & Setters
    public int getSeatCapacity() { return seatCapacity; }
    public void setSeatCapacity(int seatCapacity) { this.seatCapacity = seatCapacity; }

    public int getNumberOfDoors() { return numberOfDoors; }
    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }

    // Overridden displayInfo() method
    @Override
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Model: " + getModel());
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
        System.out.println("Country of Manufacture: " + getCountryOfManufacture());
        System.out.println("Color: " + getColor());
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
