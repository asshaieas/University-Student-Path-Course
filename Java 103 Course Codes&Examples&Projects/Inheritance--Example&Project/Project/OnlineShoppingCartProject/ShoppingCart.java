package OnlineShoppingCartProject;
import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCart {
    private ArrayList<Product> products;
    private Scanner scanner;
    // Constructor initializes product list and scanner
    public ShoppingCart() {
        this.products = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    // Method to add a product dynamically
    public void addProduct() {
        System.out.println("\nSelect Product Type to Add:");
        System.out.println("1. General Product");
        System.out.println("2. Electronics");
        System.out.println("3. Clothing");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Stock Quantity: ");
        int stockQuantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Handle different product types
        switch (choice) {
            case 1: // General Product
                products.add(new Product(productName, price, stockQuantity));
                break;
            case 2: // Electronics
                System.out.print("Enter Warranty Period: ");
                String warranty = scanner.nextLine();
                products.add(new Electronics(productName, price, stockQuantity, warranty));
                break;
            case 3: // Clothing
                System.out.print("Enter Size: ");
                String size = scanner.nextLine();

                System.out.print("Enter Color: ");
                String color = scanner.nextLine();

                System.out.print("Enter Gender (Men/Women/Unisex): ");
                String gender = scanner.nextLine();

                System.out.print("Enter Brand: ");
                String brand = scanner.nextLine();

                System.out.print("Enter Type (Casual, Formal, Sports, etc.): ");
                String type = scanner.nextLine();

                products.add(new Clothing(productName, price, stockQuantity, size, color, gender, brand, type));
                break;
            default:
                System.out.println("Invalid choice! Product not added.");
                return;
        }
        System.out.println("✅ Product added successfully!\n");
    }

    // Method to remove a product from the cart
    public void removeProduct() {
        if (products.isEmpty()) {
            System.out.println("❌ Your cart is empty. Nothing to remove.\n");
            return;
        }
        displayCart();
        System.out.print("Enter the index of the product to remove (starting from 1): ");
        int index = scanner.nextInt();
        if (index < 1 || index > products.size()) {
            System.out.println("❌ Invalid index! No product removed.\n");
            return;
        }
        products.remove(index - 1);
        System.out.println("✅ Product removed successfully!\n");
    }

    // Method to display all products in the cart
    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("\n🛒 Your shopping cart is empty!\n");
            return;
        }
        System.out.println("\n🛍 Shopping Cart Items:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
            System.out.println("----------------------");
        }
    }

    // Method to display the menu and interact with the user
    public void startShopping() {
        while (true) {
            System.out.println("\n========= 🛒 Shopping Cart Menu =========");
            System.out.println("1. Add a Product");
            System.out.println("2. Remove a Product");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    displayCart();
                    break;
                case 4:
                    System.out.println("✅ Exiting... Thank you for shopping! 🛍");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice! Please enter a valid option.");
            }
        }
    }

    // Main method to run the shopping cart
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.startShopping();
    }
}
