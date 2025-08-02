package tasks;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int asciivalue=(int)ch;
		System.out.println("Character entered :"+ch);
		System.out.println("Asciivalue of character :"+asciivalue);
		sc.close();
	}

}
