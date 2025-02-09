package RobotBehaviorSystemExample;

/**
 * This class tests the Robot Behavior System by creating multiple robot types
 * and demonstrating polymorphism through method overriding.
 */
public class RobotTest {
    public static void main(String[] args) {
        // Creating a Cleaning Robot
        Robot roboCleaner = new CleaningRobot("RoboCleaner");
        roboCleaner.showType();
        roboCleaner.performTask();
        System.out.println("--------------");

        // Creating a Security Robot
        Robot roboSecurity = new SecurityRobot("RoboSecurity");
        roboSecurity.showType();
        roboSecurity.performTask();
        System.out.println("--------------");

        // Creating a Delivery Robot
        Robot roboDelivery = new DeliveryRobot("RoboDelivery");
        roboDelivery.showType();
        roboDelivery.performTask();
        System.out.println("--------------");

        // Creating a Rescue Robot
        Robot roboRescue = new RescueRobot("RoboRescue");
        roboRescue.showType();
        roboRescue.performTask();
    }
}
