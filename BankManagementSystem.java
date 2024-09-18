
import java.util.HashMap;
import java.util.Scanner;

class BankAccount {

    private final String accountHolderName;
    private final int accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Current Balance: " + balance);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankManagementSystem {

    static HashMap<Integer, BankAccount> accounts = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static int accountCounter = 1000; // Starting account number

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> checkBalance();
                case 5 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Method to create a new bank account
    public static void createAccount() {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = scanner.nextDouble();

        BankAccount newAccount = new BankAccount(name, accountCounter, initialDeposit);
        accounts.put(accountCounter, newAccount);
        System.out.println("Account created successfully! Your Account Number is: " + accountCounter);
        accountCounter++;
    }

    // Method to deposit money into an account
    public static void depositMoney() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        if (accounts.containsKey(accountNumber)) {
            System.out.print("Enter Deposit Amount: ");
            double amount = scanner.nextDouble();
            accounts.get(accountNumber).deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to withdraw money from an account
    public static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        if (accounts.containsKey(accountNumber)) {
            System.out.print("Enter Withdrawal Amount: ");
            double amount = scanner.nextDouble();
            accounts.get(accountNumber).withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to check the balance of an account
    public static void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        if (accounts.containsKey(accountNumber)) {
            BankAccount account = accounts.get(accountNumber);
            System.out.println("Current Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}
