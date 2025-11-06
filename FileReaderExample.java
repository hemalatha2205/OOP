package co3_scenario;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("data.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
