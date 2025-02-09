package RobotBehaviorSystemExample;

/**
 * DeliveryRobot class extends Robot.
 * It overrides the performTask() method to handle package delivery tasks.
 */
public class DeliveryRobot extends Robot {
    public DeliveryRobot(String name) {
        super(name);
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is delivering a package to the destination...");
    }
}
