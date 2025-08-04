package tasks;

public class Task15 {
    private int id;
    private String name;
    private String course;

    public Task15() {
        this(0, "Default Name", "Default Course");
    }

    public Task15(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Course: " + this.course);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Task15 student1 = new Task15();
        Task15 student2 = new Task15(101, "Alice", "Computer Science");

        student1.display();
        student2.display();
    }
}
