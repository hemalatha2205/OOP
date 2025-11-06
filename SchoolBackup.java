package co4_scenario;

import java.io.*;

public class SchoolBackup {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("grades.txt"));
             FileWriter fw = new FileWriter("grades_backup.txt")) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                if (Integer.parseInt(p[1]) > 75) {
                    fw.write(line + "\n");
                    count++;
                }
            }
            System.out.println("Backed up students: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
