import java.util.ArrayList;
import java.util.Scanner;
class Product{
    private final int id;
    private final String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

}

public class InventoryManagement{
    private static final ArrayList<Product> inventory = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while(running){
            System.out.println("====Inventory Management System====");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Modify Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1 -> addProduct();
                case 2 -> viewAllProducts();
                case 3 -> modifyProduct();
                case 4 -> deleteProduct();
                case 5 -> {
                    running = false;
                    System.out.println("Existing....");
                }
                default -> System.out.println("Invalid choice Please try again!");  
            }
        }


    }

    // add product
    public static void addProduct(){
        System.out.print("Enter Product id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Product quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(id, name, price, quantity);
        inventory.add(product);
        System.out.println("Product added Successfully!");
    }

    // view all product
    public static void viewAllProducts(){
        if(inventory.isEmpty()){
            System.out.println("No product in the Inventory!");
        }else{
            System.out.println("\n====Products List====");
            for(Product product: inventory){
                System.out.println(product);
            }
        }
    }

    // modify product
    public static void modifyProduct(){
        System.out.print("Enter Product id to modify: ");
        int id = scanner.nextInt();
        Product product = findProductById(id);

        if(product != null){
            System.out.println("Product found: " + product);
            System.out.print("Enter new price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter new quantiy: ");
            int quantity = scanner.nextInt();

            product.setPrice(price);
            product.setQuantity(quantity);
            System.out.println("Product modified successfull!");

        }else{
            System.out.println("No product found!");
        }
    }

    // delete product
    public static void deleteProduct(){
        System.out.print("Enter product id to delete: ");
        int id = scanner.nextInt();
        Product product = findProductById(id);
        if(product != null){
            inventory.remove(product);
            System.out.print("Product delete successfull!");
        }else{
            System.out.println("No product found!");
        }
    }


    // find product by id
    public static Product findProductById(int id){
        for (Product product: inventory){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }
}