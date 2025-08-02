package tasks;
import java.util.*;
class Student{
	String name;
	int rollno;
	int marks;
	void setter(String name,int rollno,int marks) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	void getter() {
		System.out.println("Name of the student: "+name);
		System.out.println("Rollno of the student: "+rollno);
		System.out.println("Marksof the student: "+marks);
	}
}

public class PracticalTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of student");
		String name=sc.next();
		System.out.println("Enter rollno of student");
		int rollno=sc.nextInt();
		System.out.println("Enter marks of student");
		int marks=sc.nextInt();
        Student st = new Student();
        st.setter(name,rollno,marks);
        st.getter();
        sc.close();
	}

}

