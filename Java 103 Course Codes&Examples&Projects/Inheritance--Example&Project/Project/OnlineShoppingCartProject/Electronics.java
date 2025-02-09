package OnlineShoppingCartProject;

/**
 * Represents an electronics product in the online shopping cart.
 * Inherits from the Product class and adds a warranty period.
 */
public class Electronics extends Product {

    // Additional field specific to electronics
    protected String warrantyPeriod;

    /**
     * Constructor to initialize an electronics product.
     *
     * @param productName    The name of the product.
     * @param price          The price of the product.
     * @param stockQuantity  The available stock quantity.
     * @param warrantyPeriod The warranty period of the product (e.g., "2 years").
     */
    public Electronics(String productName, double price, int stockQuantity, String warrantyPeriod) {
        super(productName, price, stockQuantity);
        if (warrantyPeriod == null || warrantyPeriod.trim().isEmpty()) {
            throw new IllegalArgumentException("Warranty period cannot be empty.");
        }
        this.warrantyPeriod = warrantyPeriod;
    }

    /**
     * Getter for warranty period.
     *
     * @return The warranty period of the product.
     */
    public String getWarrantyPeriod() {
        return this.warrantyPeriod;
    }
    /**
     * Setter for warranty period.
     *
     * @param warrantyPeriod The new warranty period.
     */
    public void setWarrantyPeriod(String warrantyPeriod) {
        if (warrantyPeriod == null || warrantyPeriod.trim().isEmpty()) {
            throw new IllegalArgumentException("Warranty period cannot be empty.");
        }
        this.warrantyPeriod = warrantyPeriod;
    }

    /**
     * Returns a formatted string representation of the electronics product.
     *
     * @return A string containing product details and warranty information.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Warranty Period: " + warrantyPeriod + "\n";
    }
}
