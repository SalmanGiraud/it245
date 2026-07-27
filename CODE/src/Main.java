//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList Solution:");

        ArrayListTaskScheduler listScheduler =
                new ArrayListTaskScheduler();

        listScheduler.addTask(101, "Prepare Report", 2);
        listScheduler.addTask(102, "Resolve System Failure", 1);
        listScheduler.addTask(103, "Update Records", 3);
        listScheduler.addTask(104, "Answer Urgent Email", 1);

        listScheduler.displayTasks();

        System.out.println("\nProcessed Task:");
        System.out.println(listScheduler.processNextTask());

        System.out.println("\nPriority Queue Solution:");

        HeapTaskScheduler heapScheduler =
                new HeapTaskScheduler();

        heapScheduler.addTask(101, "Prepare Report", 2);
        heapScheduler.addTask(102, "Resolve System Failure", 1);
        heapScheduler.addTask(103, "Update Records", 3);
        heapScheduler.addTask(104, "Answer Urgent Email", 1);

        heapScheduler.displayTasks();

        System.out.println("\nProcessed Task:");
        System.out.println(heapScheduler.processNextTask());
    }
}