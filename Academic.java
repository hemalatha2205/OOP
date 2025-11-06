package co2_scena;

//Base class
class Person {
 void displayInfo() {
     System.out.println("Basic person information.");
 }
}

//Derived class
class Student extends Person {
 String studentID = "S123";
 void showStudentInfo() {
     System.out.println("Student ID: " + studentID);
 }
}

//Further derived class
class GraduateStudent extends Student {
 void submitThesis() {
     System.out.println("Graduate student submits thesis.");
 }
}

public class Academic {
 public static void main(String[] args) {
     GraduateStudent gs = new GraduateStudent();
     gs.displayInfo();     // from Person
     gs.showStudentInfo(); // from Student
     gs.submitThesis();    // from GraduateStudent
 }
}
