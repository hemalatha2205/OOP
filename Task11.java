package tasks;

import java.util.*;

public class Task11 {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();


	        double area = PI * radius * radius;
	        double circumference = 2 * PI * radius;


	        System.out.println("Area of the circle: " + area);
	        System.out.println("Circumference of the circle: " + circumference);

	        scanner.close();
		

	}

}
