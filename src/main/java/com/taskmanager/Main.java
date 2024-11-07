package com.taskmanager;

import com.taskmanager.model.Task;
import com.taskmanager.repository.TaskRepository;
import com.taskmanager.service.TaskService;
import com.taskmanager.util.ConsoleUtil;

public class Main {
    public static void main(String[] args) {
        TaskRepository taskRepository = new TaskRepository();
        TaskService taskService = new TaskService(taskRepository);
        ConsoleUtil consoleUtil = new ConsoleUtil();
        ConsoleUtil.printWelcomeMessage();

        // Main application loop
        boolean running = true;
        while (running) {
            int choice = consoleUtil.showMainMenu();
            switch (choice) {
                case 1:
                    taskService.addTask(consoleUtil.getTaskDetails());
                    ConsoleUtil.print("Task added successfully.");
                    break;
                case 2:
                    int taskIdToUpdate = consoleUtil.getTaskId();
                    Task taskToUpdate = taskService.getTask(taskIdToUpdate);
                    if (taskToUpdate != null) {
                        ConsoleUtil.print("Enter new details for the task:");
                        String newTitle = consoleUtil.readString("Enter new task title: ");
                        String newDescription = consoleUtil.readString("Enter new task description: ");
                        boolean newCompleted = consoleUtil.readString("Is the task completed? (yes/no): ")
                                .equalsIgnoreCase("yes");
                        taskToUpdate.setTitle(newTitle);
                        taskToUpdate.setDescription(newDescription);
                        taskToUpdate.setCompleted(newCompleted);
                        taskService.updateTask(taskToUpdate);
                        ConsoleUtil.print("Task updated successfully.");
                    } else {
                        ConsoleUtil.print("Task not found. Create a task first before editing.");
                    }
                    break;
                case 3:
                    int taskIdToDelete = consoleUtil.getTaskId();
                    if (taskService.getTask(taskIdToDelete) != null) {
                        taskService.deleteTask(taskIdToDelete);
                        ConsoleUtil.print("Task deleted successfully.");
                    } else {
                        ConsoleUtil.print("Task not found. Create a task first before deleting.");
                    }
                    break;
                case 4:
                    if (taskService.getAllTasks().isEmpty()) {
                        ConsoleUtil.print("No tasks available to display.");
                    } else {
                        consoleUtil.displayTasks(taskService.getAllTasks());
                    }
                    break;
                case 5:
                    running = false;
                    consoleUtil.printGoodbyeMessage();
                    break;
                default:
                    consoleUtil.printInvalidChoiceMessage();
                    break;
            }
        }
        ConsoleUtil.closeScanner();
    }
}