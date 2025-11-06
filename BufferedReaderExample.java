package co3_scenario;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("NullPointerException")) {
                    count++;
                }
            }
            System.out.println("Total NullPointerException errors: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}