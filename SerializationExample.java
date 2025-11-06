package co3_scenario;


import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Ravi", 50000.0);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("Employee object serialized!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee e = (Employee) ois.readObject();
            System.out.println("Deserialized Employee Details:");
            System.out.println("ID: " + e.id + ", Name: " + e.name + ", Salary: " + e.salary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}