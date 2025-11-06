package abstractclasses;
abstract class FoodOrder {
    abstract double calculateTotal();
    void generateBill(double total) {
        System.out.println("******** BILL ********");
        System.out.println("Total Amount: ₹" + total);
        System.out.println("Thank you for ordering!");
    }
}

class RestaurantOrder extends FoodOrder {
    double calculateTotal() {
        double base = 500;
        double tax = base * 0.05;
        return base + tax;
    }
}

class CloudKitchenOrder extends FoodOrder {
    double calculateTotal() {
        double base = 400;
        double packagingFee = 30;
        return base + packagingFee;
    }
}

public class FoodDelivery{
    public static void main(String[] args) {
        RestaurantOrder r = new RestaurantOrder();
        double total1 = r.calculateTotal();
        r.generateBill(total1);

        CloudKitchenOrder c = new CloudKitchenOrder();
        double total2 = c.calculateTotal();
        c.generateBill(total2);
    }
}
