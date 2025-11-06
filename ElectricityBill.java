package interface_;

interface Plan {
    double getRate();
    default double calculateBill(int units) {
        return units * getRate();
    }
}

class DomesticPlan implements Plan {
    public double getRate() { return 3.50; }
}

class CommercialPlan implements Plan {
    public double getRate() { return 7.50; }
}

class InstitutionalPlan implements Plan {
    public double getRate() { return 5.50; }
}

class PlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) return null;
        switch (planType.toLowerCase()) {
            case "domestic": return new DomesticPlan();
            case "commercial": return new CommercialPlan();
            case "institutional": return new InstitutionalPlan();
            default: return null;
        }
    }
}

public class ElectricityBill {
    public static void main(String[] args) {
        PlanFactory factory = new PlanFactory();
        Plan p = factory.getPlan("commercial");
        int units = 100;
        double bill = p.calculateBill(units);
        System.out.println("Bill Amount for " + units + " units: ₹" + bill);
    }
}
