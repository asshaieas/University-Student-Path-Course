package GarageManagementSystemProject;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * GarageTest is the main class to test the Garage Management System.
 * It provides a menu-driven interface for users to add, update, remove, and display vehicles.
 *
 * Author: [Your Name]
 * Date: [Today's Date]
 */
public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        // Main menu loop
        do {
            // Display menu options
            System.out.println("""
                    ============================
                    Garage Management System
                    ============================
                    1. Add Vehicle
                    2. Update Vehicle
                    3. Remove Vehicle
                    4. Display Vehicles
                    5. Display Vehicle Details
                    6. Exit
                    """);

            System.out.print("Enter your choice (1-6): ");

            if (!input.hasNextInt()) {
                System.out.println("❌ Invalid input. Please enter a number between 1 and 6.");
                input.next(); // Clear invalid input
                continue;
            }

            choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addVehicle(garage, input);
                    break;
                case 2:
                    updateVehicle(garage, input);
                    break;
                case 3:
                    removeVehicle(garage, input);
                    break;
                case 4:
                    garage.displayAllVehicles();
                    break;
                case 5:
                    displayVehicleDetails(garage, input);
                    break;
                case 6:
                    System.out.println("✅ Exiting program... Thank you for using the Garage Management System.");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Please enter a number between 1 and 6.");
            }

        } while (choice != 6);

        input.close();
    }

    /**
     * Handles the process of adding a vehicle to the garage.
     */
    private static void addVehicle(Garage garage, Scanner input) {
        int vehicleType = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Choose the type of vehicle: ");
            System.out.println("1. Car");
            System.out.println("2. Truck");
            System.out.println("3. Motorcycle");
            System.out.print("Enter your choice (1-3): ");

            if (input.hasNextInt()) {
                vehicleType = input.nextInt();
                input.nextLine(); // Consume newline

                if (vehicleType >= 1 && vehicleType <= 3) {
                    validInput = true;
                } else {
                    System.out.println("❌ Invalid choice. Please enter a number between 1 and 3.");
                }
            } else {
                System.out.println("❌ Invalid input. Please enter a number.");
                input.next(); // Clear invalid input
            }
        }

        System.out.print("Enter the owner name: ");
        String ownerName = input.nextLine();
        System.out.print("Enter the model: ");
        String model = input.nextLine();
        System.out.print("Enter the brand: ");
        String brand = input.nextLine();

        int year = 0;
        validInput = false;
        while (!validInput) {
            System.out.print("Enter the manufacturing year: ");
            if (input.hasNextInt()) {
                year = input.nextInt();
                input.nextLine(); // Consume newline
                if (year >= 1885 && year <= 2050) {
                    validInput = true;
                } else {
                    System.out.println("❌ Invalid year! Please enter a valid year (1885-2050).");
                }
            } else {
                System.out.println("❌ Invalid input! Please enter a valid year.");
                input.next(); // Clear invalid input
            }
        }

        System.out.print("Enter the manufacturer country: ");
        String country = input.nextLine();
        System.out.print("Enter the color: ");
        String color = input.nextLine();

        switch (vehicleType) {
            case 1 -> { // Car
                int seatingCapacity = getIntInput("Enter seating capacity: ", input);
                int numberOfDoors = getIntInput("Enter number of doors: ", input);
                garage.addVehicle(new Car(ownerName, model, brand, year, country, color, seatingCapacity, numberOfDoors));
                System.out.println("✅ Car added successfully!");
            }
            case 2 -> { // Truck
                int loadCapacity = getIntInput("Enter load capacity (in tons): ", input);
                garage.addVehicle(new Truck(ownerName, model, brand, year, country, color, loadCapacity));
                System.out.println("✅ Truck added successfully!");
            }
            case 3 -> { // Motorcycle
                int engineCapacity = getIntInput("Enter the engine capacity: ", input);
                int gear = getIntInput("Enter the number of gears: ", input);
                garage.addVehicle(new Motorcycle(ownerName, model, brand, year, country, color, engineCapacity, gear));
                System.out.println("✅ Motorcycle added successfully!");
            }
        }
    }

    /**
     * Handles updating vehicle details.
     */
    private static void updateVehicle(Garage garage, Scanner input) {
        System.out.print("Enter the owner name of the vehicle to update: ");
        String ownerName = input.nextLine();
        System.out.print("Enter new brand: ");
        String newBrand = input.nextLine();
        System.out.print("Enter new model: ");
        String newModel = input.nextLine();
        System.out.print("Enter new color: ");
        String newColor = input.nextLine();
        System.out.print("Enter new owner name: ");
        String newOwner = input.nextLine();

        garage.updateVehicle(ownerName, newBrand, newModel, newColor, newOwner);
    }

    /**
     * Handles removing a vehicle.
     */
    private static void removeVehicle(Garage garage, Scanner input) {
        System.out.print("Enter the owner name of the vehicle to remove: ");
        String ownerName = input.nextLine();
        garage.removeVehicle(ownerName);
    }

    /**
     * Handles displaying specific vehicle details.
     */
    private static void displayVehicleDetails(Garage garage, Scanner input) {
        System.out.print("Enter the owner name: ");
        String ownerName = input.nextLine();
        System.out.print("Enter the model: ");
        String model = input.nextLine();
        garage.displayVehicleDetails(ownerName, model);
    }

    /**
     * A helper method to get a valid integer input.
     */
    private static int getIntInput(String message, Scanner input) {
        int value;
        while (true) {
            System.out.print(message);
            if (input.hasNextInt()) {
                value = input.nextInt();
                input.nextLine(); // Consume newline
                return value;
            } else {
                System.out.println("❌ Invalid input. Please enter a valid number.");
                input.next(); // Clear invalid input
            }
        }
    }
}
