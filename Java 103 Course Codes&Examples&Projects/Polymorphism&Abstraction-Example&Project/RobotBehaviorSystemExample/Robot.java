package RobotBehaviorSystemExample;

abstract class Robot {
    private String name; // Robot name

    // Constructor to initialize the robot's name
    public Robot(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void performTask();

    // Getter method (final to prevent modification in subclasses)
    public final String getName() {
        return name;
    }

    // Setter method to update name
    public void setName(String name) {
        this.name = name;
    }

    // Show robot type dynamically
    public void showType() {
        System.out.println("This is a " + getClass().getSimpleName() + " named " + name);
    }
}
