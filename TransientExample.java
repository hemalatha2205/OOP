package co3_scenario;

import java.io.*;

class BankAccount implements Serializable {
    String accountNumber;
    String holderName;
    transient String password; // Will not be serialized

    BankAccount(String accountNumber, String holderName, String password) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.password = password;
    }
}

public class TransientExample {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456789", "Meena", "mySecret123");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.ser"))) {
            oos.writeObject(acc);
            System.out.println("BankAccount object serialized!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.ser"))) {
            BankAccount a = (BankAccount) ois.readObject();
            System.out.println("Deserialized Account Details:");
            System.out.println("Account No: " + a.accountNumber);
            System.out.println("Holder: " + a.holderName);
            System.out.println("Password (transient): " + a.password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
