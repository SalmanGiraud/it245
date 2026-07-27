public class Task {

    private int id;
    private String name;
    private int priority;
    private long arrivalOrder;

    public Task(int id, String name, int priority, long arrivalOrder) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.arrivalOrder = arrivalOrder;
    }

    public int getPriority() {
        return priority;
    }

    public long getArrivalOrder() {
        return arrivalOrder;
    }

    @Override
    public String toString() {
        return "Task ID: " + id
                + ", Name: " + name
                + ", Priority: " + priority;
    }

}
