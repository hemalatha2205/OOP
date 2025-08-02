package tasks;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num a:");
		int a=sc.nextInt();
		System.out.println("Enter num b");
		int b=sc.nextInt();
		System.out.println("AND operation:"+(a&b)+" Binary:"+Integer.toBinaryString(a&b));
		System.out.println("OR operation:"+(a|b)+" Binary:"+Integer.toBinaryString(a|b));
		System.out.println("EX-OR:"+(a^b)+" Binary:"+Integer.toBinaryString(a^b));
		System.out.println("left shift:"+(a<<b)+" Binary:"+Integer.toBinaryString(a<<b));
		System.out.println("Right shift:"+(a>>b)+" Binary:"+Integer.toBinaryString(a>>b));
		sc.close();
	}

}
