/**
 * BankAccount Class
 * This class represents a simple bank account with a balance.
 * It includes:
 * 1. A default constructor.
 * 2. A parameterized constructor to set the balance.
 * 3. A copy constructor to create a copy of an existing BankAccount object.
 * 4. Getter for balance.
 * 5. Setter for balance.
 */

public class BankAccount {
    private double balance;

    // Default constructor
    public BankAccount() {
        balance = 0.0;
    }

    // Parameterized constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Copy constructor
    public BankAccount(BankAccount account) {
        this.balance = account.balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount originalAccount = new BankAccount(500.0);

        // Create a copy of the originalAccount using the copy constructor
        BankAccount copiedAccount = new BankAccount(originalAccount);

        // Display the balances
        System.out.println("Original Account Balance: " + originalAccount.getBalance());
        System.out.println("Copied Account Balance: " + copiedAccount.getBalance());
    }
}

/**
 * This class demonstrates the use of a copy constructor in Java.
 * The main method creates an instance of BankAccount and a copy of that instance
 * using the copy constructor. It then displays the balances of both accounts
 * to show that the copy constructor successfully copied the balance from the original.
 */
