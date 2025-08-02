package tasks;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student's details:");
		
		System.out.println("Enter Student name:");
			String name=sc.nextLine();
			
			System.out.println("Enter roll.no:");
			int rollno=sc.nextInt();
			
			System.out.println("Enter age:");
			int age=sc.nextInt();
			
			System.out.println("Enter gender:");
			String gender=sc.next();
			
			System.out.println("Enter Percentage:");
		    float percentage=sc.nextFloat();
		    
		    System.out.println("Name:"+name);
		    System.out.println("Rollno:"+rollno);
		    System.out.println("Age:"+age);
		    System.out.println("Gender:"+gender);
		    System.out.println("Percentage:"+percentage);
		    
		    sc.close();
		    sc=null;
		    System.gc();
		    
	
	}

}
