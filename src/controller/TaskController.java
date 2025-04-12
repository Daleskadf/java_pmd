package controller;

import service.TaskService;
import util.InputHelper;
import java.util.Scanner;

public class TaskController {
    private final TaskService taskService;
    private final Scanner scanner;

    public TaskController() {
        taskService = new TaskService();
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;
        while (running) {
            printMenu();
            int option = InputHelper.readInt(scanner, "Select an option: ");

            switch (option) {
                case 1 -> addTask();
                case 2 -> listTasks();
                case 3 -> toggleTaskCompletion();
                case 4 -> deleteTask();
                case 5 -> editTask();
                case 6 -> running = false;
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private void printMenu() {
        System.out.println("""
                === Task Manager ===
                1. Add Task
                2. List Tasks
                3. Complete/Uncomplete Task
                4. Delete Task
                5. Edit Task
                6. Exit
                """);
    }

    private void addTask() {
        String title = InputHelper.readLine(scanner, "Enter task title: ");
        taskService.addTask(title);
        System.out.println("Task added!");
    }

    private void listTasks() {
        var tasks = taskService.getAllTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }

    private void toggleTaskCompletion() {
        int index = InputHelper.readInt(scanner, "Enter task index to complete/uncomplete: ");
        if (taskService.completeTask(index)) {
            System.out.println("Task status updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private void deleteTask() {
        int index = InputHelper.readInt(scanner, "Enter task index to delete: ");
        if (taskService.deleteTask(index)) {
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private void editTask() {
        int index = InputHelper.readInt(scanner, "Enter task index to edit: ");
        String newTitle = InputHelper.readLine(scanner, "Enter new task title: ");
        if (taskService.editTask(index, newTitle)) {
            System.out.println("Task updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}
