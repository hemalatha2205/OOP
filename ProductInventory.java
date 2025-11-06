package co4_scenario;


import java.util.*;

public class ProductInventory {
    public static void main(String[] args) {
        ArrayList<Integer> quantities = new ArrayList<>();

        // Add product quantities
        quantities.add(10);
        quantities.add(20);
        quantities.add(15);

        // Update quantity at index 1
        quantities.set(1, 25);

        // Display quantities
        System.out.println("Product Quantities: " + quantities);

        // Calculate total quantity
        int total = 0;
        for (int qty : quantities) {
            total += qty;
        }
        System.out.println("Total Quantity: " + total);

        // Clear all data
        quantities.clear();
        System.out.println("After clearing: " + quantities);
    }
}
