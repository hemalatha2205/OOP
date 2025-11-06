package co4_scenario;

import java.io.*;

class Employee implements Serializable {
    String name;
    int id;
    double salary;
    transient String password; // Not to be serialized

    Employee(String name, int id, double salary, String password) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.password = password;
    }
}

public class HRApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Meena", 101, 55000, "secure@123");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("Employee serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee e = (Employee) ois.readObject();
            System.out.println("Deserialized Employee Details:");
            System.out.println("Name: " + e.name + ", ID: " + e.id + ", Salary: " + e.salary + ", Password: " + e.password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
