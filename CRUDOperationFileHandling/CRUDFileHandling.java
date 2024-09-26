package CRUDOperationFileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CRUDFileHandling {

    // Method to create a new file
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Method to write data to the file (Create/Update)
    public static void writeToFile(String fileName, String data) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            System.out.println("Data written successfully to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Method to read data from the file (Read)
    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            System.out.println("File Contents:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Method to delete the file (Delete)
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "data.txt";
        
        while (true) {
            System.out.println("\nCRUD File Handling Menu:");
            System.out.println("1. Create File");
            System.out.println("2. Write to File");
            System.out.println("3. Read from File");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    createFile(fileName);
                    break;
                case 2:
                    System.out.print("Enter data to write to file: ");
                    String data = scanner.nextLine();
                    writeToFile(fileName, data);
                    break;
                case 3:
                    readFile(fileName);
                    break;
                case 4:
                    deleteFile(fileName);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
