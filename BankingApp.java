package abstractclasses;

abstract class BankAccount {
    private double balance;
    int accountNumber;

    abstract double calculateInterest();

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount + " | Balance: ₹" + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + " | Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    protected double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    double calculateInterest() {
        return getBalance() * 0.04;
    }
}

class CurrentAccount extends BankAccount {
    double calculateInterest() {
        return 0;
    }
}

public class BankingApp {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit(5000);
        s.withdraw(1000);
        System.out.println("Interest: ₹" + s.calculateInterest());

        CurrentAccount c = new CurrentAccount();
        c.deposit(8000);
        c.withdraw(2000);
        System.out.println("Interest: ₹" + c.calculateInterest());
    }
}
