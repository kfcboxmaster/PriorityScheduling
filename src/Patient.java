public class Patient {
    private String name;
    private String condition;
    private int priority;

    public Patient(String name, String condition, int priority) {
        this.name = name;
        this.condition = condition;
        this.priority = priority;
    }
    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public int getPriority() {
        return priority;
    }
}
