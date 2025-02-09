package GarageManagementSystemProject;
public abstract class Vehicle {
    private String ownerName;
    private String model;
    private String brand;
    private final int year;  // Year shouldn't change after creation
    private final String countryOfManufacture;
    private String color;

    // Constructor
    public Vehicle(String ownerName, String model, String brand, int year,
                   String countryOfManufacture, String color) {
        this.ownerName = ownerName;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.countryOfManufacture = countryOfManufacture;
        this.color = color;
    }

    // Getters & Setters
    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getYear() { return year; } // No setter (final attribute)

    public String getCountryOfManufacture() { return countryOfManufacture; } // No setter (final attribute)

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public abstract void displayInfo();
}
