package tasks;

public class Task13 {

    private int studentId;
    private String studentName;


    private static String collegeName;

    static {
        collegeName = "ABC Engineering College";
        System.out.println("Static block executed: College name initialized.");
    }


    public Task13(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    public static void changeCollegeName(String newCollegeName) {
        collegeName = newCollegeName;
    }


    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
        System.out.println("---------------------------------");
    }


    public static void main(String[] args) {
        Task13 student1 = new Task13(101, "Alice");
        Task13 student2 = new Task13(102, "Bob");

        student1.displayDetails();
        student2.displayDetails();


        Task13.changeCollegeName("XYZ Institute of Technology");

        student1.displayDetails();
        student2.displayDetails();
    }
}