package RobotBehaviorSystemExample;

public class CleaningRobot extends Robot {
    public CleaningRobot(String name) {
        super(name);
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is cleaning in progress...");
    }
}
