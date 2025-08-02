package tasks;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		double a=sc.nextDouble();
		int b=(int)a;
		System.out.println("Double value: "+a+" narrowed to int, value is:"+b);
        sc.close();
	}

}
