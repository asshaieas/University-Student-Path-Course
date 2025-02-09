package RobotBehaviorSystemExample;

/**
 * SecurityRobot class extends Robot.
 * It overrides the performTask() method to provide security functionalities.
 */
public class SecurityRobot extends Robot {
    public SecurityRobot(String name) {
        super(name);
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is scanning the area for threats...");
    }
}
