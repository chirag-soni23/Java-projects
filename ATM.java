import java.util.Scanner;

public class ATM {
    // Initial balance and PIN
    private double balance = 10000; // Starting balance
    private final int PIN = 1234;

    // Method to authenticate the user
    public boolean verifyPIN(int enteredPIN) {
        return enteredPIN == PIN;
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
            checkBalance();
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew ₹" + amount);
            checkBalance();
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Main method to run the ATM simulation
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ATM atm = new ATM();
            
            System.out.print("Enter your PIN: ");
            int enteredPIN = sc.nextInt();
            
            // Verify PIN
            if (atm.verifyPIN(enteredPIN)) {
                int option;
                do {
                    System.out.println("\nATM Menu:");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");
                    option = sc.nextInt();
                    
                    switch (option) {
                        case 1 -> atm.checkBalance();
                        case 2 -> {
                            System.out.print("Enter amount to deposit: ₹");
                            double depositAmount = sc.nextDouble();
                            atm.deposit(depositAmount);
                        }
                        case 3 -> {
                            System.out.print("Enter amount to withdraw: ₹");
                            double withdrawAmount = sc.nextDouble();
                            atm.withdraw(withdrawAmount);
                        }
                        case 4 -> System.out.println("Thank you for using the ATM. Goodbye!");
                        default -> System.out.println("Invalid option! Please try again.");
                    }
                } while (option != 4);
            } else {
                System.out.println("Incorrect PIN. Exiting...");
            }
        }
    }
}
