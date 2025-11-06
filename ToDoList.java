package co4_scenario;

import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        // Add tasks
        tasks.add("Buy groceries");
        tasks.add("Pay bills");
        tasks.add("Complete project");
        tasks.add("Call friend");

        // Retrieve a task by index
        System.out.println("Task at index 2: " + tasks.get(2));

        // Remove a completed task
        tasks.remove("Pay bills");

        // Sort tasks alphabetically
        Collections.sort(tasks);

        // Check if list is empty
        System.out.println("Is to-do list empty? " + tasks.isEmpty());

        // Display all tasks
        System.out.println("Final To-Do List: " + tasks);
    }
}
