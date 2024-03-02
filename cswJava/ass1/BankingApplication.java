
// Consider a scenario where you are tasked with developing a simple banking application 
// using Java, employing the concept of polymorphism. Your application should consist of three 
// classes: Account, SavingsAccount, and CurrentAccount. The Account class serves as the 
// base class with private attributes for account number and balance, along with abstract methods 
// for deposit and withdrawal. The SavingsAccount class, a subclass of Account, should include 
// an additional attribute for interest rate and override the deposit method to calculate interest, as 
// well as override the withdrawal method to ensure a sufficient balance. Similarly, the 
// CurrentAccount class, also a subclass of Account, should incorporate an overdraft limit 
// attribute and override the withdrawal method to check the overdraft limit. Implement the 
// classes as described, ensuring proper encapsulation and abstraction. Finally, create a 
// BankingApplication class (Main) to demonstrate the polymorphic behavior by creating 
// instances of both SavingsAccount and CurrentAccount, testing deposit and withdrawal 
// operations, and displaying account details.
// Account.java
// Account.java
// Account.java
// Account.java
import java.util.Scanner;

// Base class: Account
abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract methods for deposit and withdrawal
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Getters for account details
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter for balance (used by subclasses)
    protected void setBalance(double newBalance) {
        balance = newBalance;
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        // Calculate interest and add to balance
        double interest = amount * (interestRate / 100);
        double totalAmount = amount + interest;
        setBalance(getBalance() + totalAmount);
    }

    @Override
    public void withdraw(double amount) {
        // Ensure sufficient balance
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

// Subclass: CurrentAccount
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        // Implement the deposit logic for CurrentAccount (if needed)
        // For example, you can simply add the deposited amount to the balance:
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        // Check overdraft limit
        double availableBalance = getBalance() + overdraftLimit;
        if (amount <= availableBalance) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Exceeds overdraft limit. Transaction denied.");
        }
    }
}

// Main class: BankingApplication
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000.0, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 2000.0, 1000.0);

        // Deposit and withdraw operations
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);

        currentAccount.deposit(800.0);
        currentAccount.withdraw(2500.0);

        // Display account details
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());

        System.out.println("\nCurrent Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: $" + currentAccount.getBalance());

        scanner.close();
    }
}
