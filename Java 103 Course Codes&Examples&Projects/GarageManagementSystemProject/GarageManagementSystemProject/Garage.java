package GarageManagementSystemProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Garage class to manage a collection of vehicles.
 * Provides functionality to add, update, remove, and display vehicles.
 */
public class Garage {
    private List<Vehicle> vehicles; // List to store vehicles in the garage

    /**
     * Constructor to initialize the Garage with an empty vehicle list.
     */
    public Garage() {
        this.vehicles = new ArrayList<>();
    }

    /**
     * Adds a new vehicle to the garage.
     *
     * @param vehicle The vehicle to be added.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    /**
     * Updates vehicle details based on the owner's name.
     *
     * @param ownerName The name of the current owner of the vehicle.
     * @param newBrand  The new brand of the vehicle.
     * @param newModel  The new model of the vehicle.
     * @param newColor  The new color of the vehicle.
     * @param newOwner  The new owner's name.
     */
    public void updateVehicle(String ownerName, String newBrand, String newModel,
                              String newColor, String newOwner) {
        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.getOwnerName().equalsIgnoreCase(ownerName)) {
                v.setBrand(newBrand);
                v.setModel(newModel);
                v.setColor(newColor);
                v.setOwnerName(newOwner);
                System.out.println("Vehicle updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No vehicle found for owner: " + ownerName);
        }
    }

    /**
     * Removes a vehicle from the garage based on the owner's name.
     *
     * @param ownerName The name of the owner whose vehicle needs to be removed.
     */
    public void removeVehicle(String ownerName) {
        Iterator<Vehicle> iterator = vehicles.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Vehicle v = iterator.next();
            if (v.getOwnerName().equalsIgnoreCase(ownerName)) {
                iterator.remove();
                System.out.println("Vehicle removed successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No vehicle found for owner: " + ownerName);
        }
    }

    /**
     * Displays all vehicles in the garage.
     * If no vehicles are found, it prints a message indicating an empty garage.
     */
    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found in the garage.");
        } else {
            for (Vehicle v : vehicles) {
                v.displayInfo();
                System.out.println("------------------------");
            }
        }
    }

    /**
     * Displays details of a specific vehicle based on owner name and model.
     *
     * @param ownerName The name of the vehicle owner.
     * @param model     The model of the vehicle.
     */
    public void displayVehicleDetails(String ownerName, String model) {
        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.getOwnerName().equalsIgnoreCase(ownerName) &&
                    v.getModel().equalsIgnoreCase(model)) {
                v.displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No vehicle found with owner: " + ownerName + " and model: " + model);
        }
    }
}
