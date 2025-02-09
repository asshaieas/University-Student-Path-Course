package VehicleExample;
public class TestVehicles {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 180);
        Car myCar = new Car("Honda", "Civic", 220, 4);
        Truck truck = new Truck("Ford", "F-150", 160, 5.5);
        System.out.println("Vehicle Details:");
        vehicle.displayInfo();
        System.out.println("--------------------");
        System.out.println("Car Details:");
        myCar.displayInfo();
        System.out.println("--------------------");
        System.out.println("Truck Details:");
        truck.displayInfo();
        System.out.println("--------------------");
    }
}
