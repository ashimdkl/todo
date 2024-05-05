import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main class for the to-do list application.
 */
public class Main {
    private static ArrayList<Todo> todos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nTo-do List Application");
            System.out.println("[1] Add a to-do");
            System.out.println("[2] Mark a to-do as completed");
            System.out.println("[3] List all to-dos");
            System.out.println("[4] Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    addTodo();
                    break;
                case 2:
                    completeTodo();
                    break;
                case 3:
                    listTodos();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        scanner.close();
    }

    /**
     * Adds a new to-do based on user input.
     */
    private static void addTodo() {
        System.out.print("Enter the description of the to-do: ");
        String description = scanner.nextLine();
        Todo newTodo = new Todo(description);
        todos.add(newTodo);
        System.out.println("Added new to-do.");
    }

    /**
     * Marks a to-do as completed.
     */
    private static void completeTodo() {
        listTodos();
        System.out.print("Enter the index of the to-do to complete: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < todos.size()) {
            todos.get(index).setCompleted(true);
            System.out.println("To-do marked as completed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    /**
     * Lists all to-dos.
     */
    private static void listTodos() {
        if (todos.isEmpty()) {
            System.out.println("No to-dos found.");
        } else {
            for (int i = 0; i < todos.size(); i++) {
                System.out.println("[" + i + "] " + todos.get(i));
            }
        }
    }
}
