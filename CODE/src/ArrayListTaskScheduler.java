import java.util.ArrayList;

class ArrayListTaskScheduler {
    private ArrayList<Task> tasks = new ArrayList<>();
    private long sequence = 0;

    public void addTask(int id, String name, int priority) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Task name cannot be empty.");
            return;
        }

        if (priority < 1) {
            System.out.println("Priority must be 1 or greater.");
            return;
        }

        Task newTask = new Task(id, name, priority, sequence++);
        int position = 0;

        while (position < tasks.size()) {
            Task current = tasks.get(position);

            boolean currentHasHigherPriority =
                    current.getPriority() < newTask.getPriority();

            boolean samePriorityAndEarlier =
                    current.getPriority() == newTask.getPriority()
                            && current.getArrivalOrder() < newTask.getArrivalOrder();

            if (currentHasHigherPriority || samePriorityAndEarlier) {
                position++;
            } else {
                break;
            }
        }

        tasks.add(position, newTask);
    }

    public Task viewNextTask() {
        if (tasks.isEmpty()) {
            return null;
        }

        return tasks.get(0);
    }

    public Task processNextTask() {
        if (tasks.isEmpty()) {
            return null;
        }

        return tasks.remove(0);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No pending tasks.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}