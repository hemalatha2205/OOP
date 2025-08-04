package tasks;


class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void showPersonInfo() {
        System.out.println("Name: " + name);
    }
}

public class Task16 extends Person {
    int studentId;
    String course;

    public Task16(String name, int studentId, String course) {
        super(name);
        this.studentId = studentId;
        this.course = course;
    }

    public void displayDetails() {
        super.showPersonInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Task16 student = new Task16("Bob", 202, "Mathematics");
        student.displayDetails();
    }
}
