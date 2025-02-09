package RobotBehaviorSystemExample;

/**
 * RescueRobot class extends Robot.
 * It overrides the performTask() method to perform rescue operations.
 */
public class RescueRobot extends Robot {
    public RescueRobot(String name) {
        super(name);
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is rescuing people in danger...");
    }
}
