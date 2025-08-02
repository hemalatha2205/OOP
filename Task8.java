package tasks;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a");
		int a=sc.nextInt();
		System.out.println("Enter number b");
		int b=sc.nextInt();
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division:"+(a/b));
		System.out.println("Modulo:"+(a%b));
        sc.close();
	}

}
