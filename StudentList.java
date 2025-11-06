package co4_scenario;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        // Add student names
        students.add("Ravi");
        students.add("Meena");
        students.add("Arjun");

        // Insert at specific index
        students.add(1, "Priya");

        // Display list
        System.out.println("Student List: " + students);

        // Remove a student
        students.remove("Meena");

        // Check if a student is present
        System.out.println("Contains 'Arjun'? " + students.contains("Arjun"));

        // Display size
        System.out.println("Total Students: " + students.size());

        // Final list
        System.out.println("Updated Student List: " + students);
    }
}

