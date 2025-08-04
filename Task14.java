package tasks;

public class Task14 {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    private static double interestRate;

    static {
        interestRate = 4.5;
        System.out.println("Static block executed: Interest rate set to " + interestRate + "%");
    }

    public Task14(int accNo, String holder, double initialBalance) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = initialBalance;
    }

    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to: " + interestRate + "%");
    }

    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest for " + accountHolder + ": ₹" + interest);
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Task14 account1 = new Task14(1001, "John", 50000);
        Task14 account2 = new Task14(1002, "Emma", 75000);

        account1.displayAccount();
        account2.displayAccount();

        account1.calculateInterest();
        account2.calculateInterest();

        Task14.updateInterestRate(6.0);

        account1.calculateInterest();
        account2.calculateInterest();
    }
}

