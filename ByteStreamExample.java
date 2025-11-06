package co3_scenario;

import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("photo.jpg");
             FileOutputStream fos = new FileOutputStream("backup.jpg")) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Backup created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
