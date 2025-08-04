package example_tasks;

class Person {
    public void displayInfo() {
        System.out.println("This is a person");
    }
}

class Student extends Person {
    int studentID = 101;
}

class GraduateStudent extends Student {
    public void submitThesis() {
        System.out.println("Thesis submitted by student ID: " + studentID);
    }

    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.displayInfo();
        gs.submitThesis();
    }
}
