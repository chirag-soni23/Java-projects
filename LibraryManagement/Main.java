package LibraryManagement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Library library = new Library();
       try (Scanner scanner = new Scanner(System.in)) {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author,true));
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    title = scanner.nextLine();
                    library.issueBook(title);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    }
}
