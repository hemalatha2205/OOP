package tasks;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int a=sc.nextInt();
		System.out.println("Integer "+a);
		long b=a;
		System.out.println("Widening of int (int -> long)"+b);
		float c=(float)b;
		System.out.println("Narrowing of double (long -> float)"+c);
		sc.close();

	}

}
