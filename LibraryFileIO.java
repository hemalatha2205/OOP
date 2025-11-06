package co4_scenario;


import java.io.*;

public class LibraryFileIO {
    public static void main(String[] args) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("books.txt"));
             FileWriter fw = new FileWriter("available_books.txt")) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("B1")) {
                    fw.write(line + "\n");
                    count++;
                }
            }
            System.out.println("Books processed: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
