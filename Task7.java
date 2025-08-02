package tasks;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers ");
		System.out.println("a=");
		int a = sc.nextInt();
		System.out.println("b=");
		int b = sc.nextInt();
		System.out.println("c=");
		int c = sc.nextInt();
		System.out.println("Average of three numbers is:"+(a+b+c)/3);
        sc.close();
	}

}
