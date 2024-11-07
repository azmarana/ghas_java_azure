package com.taskmanager.util;

import com.taskmanager.model.Task;
import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static void print(String message) {
        System.out.println(message);
    }

    public static String readString(String prompt) {
        print(prompt);
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        print(prompt);
        while (!scanner.hasNextInt()) {
            print("Invalid input. Please enter a number.");
            scanner.next(); // Clear the invalid input
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()
        return input;
    }

    public static void closeScanner() {
        scanner.close();
    }

    public int showMainMenu() {
        print("Main Menu:");
        print("1. Add Task");
        print("2. Update Task");
        print("3. Delete Task");
        print("4. Display Tasks");
        print("5. Exit");
        return readInt("Enter your choice: ");
    }

    public static void printWelcomeMessage() {
        print("Welcome to the Task Manager!");
    }

    public void printGoodbyeMessage() {
        print("Goodbye!");
    }

    public void printInvalidChoiceMessage() {
        print("Invalid choice. Please try again.");
    }

    public Task getTaskDetails() {
        int id = readInt("Enter task ID: ");
        String title = readString("Enter task title: ");
        String description = readString("Enter task description: ");
        boolean completed = readString("Is the task completed? (yes/no): ").equalsIgnoreCase("yes");
        return new Task(id, title, description, completed);
    }

    public int getTaskId() {
        return readInt("Enter task ID: ");
    }

    public void displayTasks(List<Task> tasks) {
        for (Task task : tasks) {
            print(task.toString());
        }
    }
}
