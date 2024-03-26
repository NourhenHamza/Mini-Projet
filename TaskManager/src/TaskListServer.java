import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TaskListServer {
    public static void main(String[] args) {
        try {
            TaskList taskList = new TaskListImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("TaskListService", taskList);
            System.out.println("TaskList server is running...");
        } catch (Exception e) {
            System.err.println("TaskList server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
