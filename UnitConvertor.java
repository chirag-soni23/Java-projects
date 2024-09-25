
import java.util.Scanner;

public class UnitConvertor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Choose the conversion type:");
                System.out.println("1. Kilometers to Miles");
                System.out.println("2. Miles to Kilometers");
                System.out.println("3. Kilograms to Pounds");
                System.out.println("4. Pounds to Kilograms");
                System.out.println("5. Celsius to Fahrenheit");
                System.out.println("6. Fahrenheit to Celsius");
                System.out.println("7. Exit");
                int choice = scanner.nextInt();
                if (choice == 7) {
                    System.out.println("Exiting the program.");
                    break;
                }
                System.out.print("Enter the value to convert: ");
                double value = scanner.nextDouble();
                double result;

                switch (choice) {
                    case 1 -> {
                        result = kilometersToMiles(value);
                        System.out.println(value + " kilometers is " + result + " miles.");
                    }
                    case 2 -> {
                        result = milesToKilometers(value);
                        System.out.println(value + " miles is " + result + " kilometers.");
                    }
                    case 3 -> {
                        result = kilogramsToPounds(value);
                        System.out.println(value + " kilograms is " + result + " pounds.");
                    }
                    case 4 -> {
                        result = poundsToKilograms(value);
                        System.out.println(value + " pounds is " + result + " kilograms.");
                    }
                    case 5 -> {
                        result = celsiusToFahrenheit(value);
                        System.out.println(value + " Celsius is " + result + " Fahrenheit.");
                    }
                    case 6 -> {
                        result = fahrenheitToCelsius(value);
                        System.out.println(value + " Fahrenheit is " + result + " Celsius.");
                    }
                    default ->
                        System.out.println("Invalid choice.");
                }

            }
        }
    }

    // kilometers to miles
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    // miles to kilometers
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    // kilograms to pounds
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // pounds to kilograms
    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // celsius to fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // fahrenheit to celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
