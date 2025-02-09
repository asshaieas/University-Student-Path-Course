package OnlineShoppingCartProject;

/**
 * The Product class represents a generic product in an online shopping cart.
 * It includes details such as product name, price, and stock quantity.
 */
public class Product {
    // Protected fields to allow access within subclasses
    protected String productName;
    protected double price;
    protected int stockQuantity;

    /**
     * Constructor to initialize a product with a name, price, and stock quantity.
     * Ensures that price and stock are valid values.
     *
     * @param productName   The name of the product.
     * @param price         The price of the product (must be >= 0).
     * @param stockQuantity The available stock quantity (must be >= 0).
     */
    public Product(String productName, double price, int stockQuantity) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity cannot be negative.");
        }
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    /**
     * Getter for product name.
     * @return The product name.
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * Getter for product price.
     * @return The price of the product.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Getter for stock quantity.
     * @return The available stock quantity.
     */
    public int getStockQuantity() {
        return this.stockQuantity;
    }

    /**
     * Returns a formatted string representation of the product.
     * @return Product details as a string.
     */
    @Override
    public String toString() {
        return "📦 Product Details:\n" +
                "----------------------\n" +
                "Product Name  : " + productName + "\n" +
                "Price         : $" + price + "\n" +
                "Stock Quantity: " + stockQuantity + " units\n";
    }
}
