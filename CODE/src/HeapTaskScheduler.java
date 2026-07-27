import java.util.Comparator;
import java.util.PriorityQueue;

class HeapTaskScheduler {
    private PriorityQueue<Task> tasks;
    private long sequence = 0;

    public HeapTaskScheduler() {
        tasks = new PriorityQueue<>(
                Comparator.comparingInt(Task::getPriority)
                        .thenComparingLong(Task::getArrivalOrder)
        );
    }

    public void addTask(int id, String name, int priority) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Task name cannot be empty.");
            return;
        }

        if (priority < 1) {
            System.out.println("Priority must be 1 or greater.");
            return;
        }

        tasks.offer(new Task(id, name, priority, sequence++));
    }

    public Task viewNextTask() {
        return tasks.peek();
    }

    public Task processNextTask() {
        return tasks.poll();
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No pending tasks.");
            return;
        }

        PriorityQueue<Task> copy = new PriorityQueue<>(tasks);

        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}