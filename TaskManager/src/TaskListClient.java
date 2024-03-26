import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Scanner;

public class TaskListClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            TaskList taskList = (TaskList) registry.lookup("TaskListService");

            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("1. Ajouter une nouvelle tâche");
                System.out.println("2. Supprimer une tâche existante");
                System.out.println("3. Récupérer la liste complète des tâches");
                System.out.println("4. Quitter");
                System.out.print("Choisissez une action : ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Entrez le nom de la nouvelle tâche : ");
                        scanner.nextLine(); // Clear the buffer
                        String newTask = scanner.nextLine();
                        taskList.addTask(newTask);
                        System.out.println("Nouvelle tâche ajoutée : " + newTask);
                        break;
                    case 2:
                        System.out.print("Entrez le nom de la tâche à supprimer : ");
                        scanner.nextLine(); // Clear the buffer
                        String taskToRemove = scanner.nextLine();
                        if (taskList.getTasks().contains(taskToRemove)) {
                            taskList.removeTask(taskToRemove);
                            System.out.println("Tâche supprimée : " + taskToRemove);
                        } else {
                            System.out.println("La tâche spécifiée n'existe pas dans la liste.");
                        }
                        break;
                    case 3:
                        List<String> tasks = taskList.getTasks();
                        System.out.println("Liste des tâches :");
                        for (String task : tasks) {
                            System.out.println(task);
                        }
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }
            }

        } catch (Exception e) {
            System.err.println("TaskList client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
