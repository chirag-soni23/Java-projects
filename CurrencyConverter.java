import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double usdToInr = 74.50;
            double eurToInr = 87.50;
            
            System.out.println("Choose the currency to convert to INR:");
            System.out.println("1. USD to INR");
            System.out.println("2. EUR to INR");
            int choice = sc.nextInt();
            
            System.out.println("Enter the amount you want to convert:");
            double amount = sc.nextDouble();
            double result = 0;
            
            switch (choice) {
                case 1 -> {
                    result = amount * usdToInr;
                    System.out.println(amount + " USD is equal to " + result + " INR");
                }
                case 2 -> {
                    result = amount * eurToInr;
                    System.out.println(amount + " EUR is equal to " + result + " INR");
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
