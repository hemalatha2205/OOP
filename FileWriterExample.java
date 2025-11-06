package co3_scenario;

import java.io.*;
import java.util.*;

public class FileWriterExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        try (FileWriter fw = new FileWriter("users.txt", true)) {
            fw.write("Name: " + name + ", Age: " + age + ", Email: " + email + "\n");
            System.out.println("User data saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
        }
}