import java.util.ArrayList;
import java.util.Scanner;

// Define a Transaction class to store transaction details
class Transaction {
    private String type;
    private double amount;
    private String date;

    public Transaction(String type, double amount, String date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}

// Main ATM class
public class ATM {

    private double balance;
    private ArrayList<Transaction> transactionHistory;

    public ATM() {
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    // Method to display transaction history
    private void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    // Method to deposit money
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount, getCurrentDateTime()));
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid amount. Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money
    private void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdrawal", amount, getCurrentDateTime()));
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal amount must be greater than zero.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to transfer money
    private void transfer(double amount) {
        // For simplicity, assume the transfer is successful if there's enough balance
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction("Transfer", amount, getCurrentDateTime()));
            System.out.println("Successfully transferred $" + amount);
        } else if (amount <= 0) {
            System.out.println("Invalid amount. Transfer amount must be greater than zero.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Utility method to get current date and time (for transaction timestamps)
    private String getCurrentDateTime() {
        // Implement your own logic to get current date and time here
        return "yyyy-MM-dd HH:mm:ss"; // Placeholder
    }

    // Main method to run the ATM interface
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Transaction History");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            double amount;

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    amount = scanner.nextDouble();
                    deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    amount = scanner.nextDouble();
                    withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter transfer amount: $");
                    amount = scanner.nextDouble();
                    transfer(amount);
                    break;
                case 4:
                    displayTransactionHistory();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }
}
