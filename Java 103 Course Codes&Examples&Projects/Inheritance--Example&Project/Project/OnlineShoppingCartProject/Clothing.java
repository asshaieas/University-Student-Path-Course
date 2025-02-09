package OnlineShoppingCartProject;

/**
 * Represents a clothing item in the online shopping cart.
 * Inherits from the Product class and includes clothing-specific attributes.
 */
public class Clothing extends Product {

    // Additional fields for clothing attributes
    protected String size;
    protected String color;
    protected String gender;
    protected String brand;
    protected String type;

    /**
     * Constructor to initialize a clothing product.
     *
     * @param productName    The name of the product.
     * @param price          The price of the product.
     * @param stockQuantity  The available stock quantity.
     * @param size           The size of the clothing (e.g., "M", "L", "XL").
     * @param color          The color of the clothing.
     * @param gender         The intended gender (e.g., "Men", "Women", "Unisex").
     * @param brand          The brand of the clothing.
     * @param type           The type of clothing (e.g., "T-Shirt", "Jeans").
     */
    public Clothing(String productName, double price, int stockQuantity,
                    String size, String color, String gender, String brand, String type) {
        super(productName, price, stockQuantity);

        // Validate input fields to prevent empty values
        if (size == null || size.trim().isEmpty()) {
            throw new IllegalArgumentException("Size cannot be empty.");
        }
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color cannot be empty.");
        }
        if (gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Gender cannot be empty.");
        }
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Type cannot be empty.");
        }

        this.size = size;
        this.color = color;
        this.gender = gender;
        this.brand = brand;
        this.type = type;
    }

    // Getter methods
    public String getSize() { return this.size; }
    public String getColor() { return this.color; }
    public String getGender() { return this.gender; }
    public String getBrand() { return this.brand; }
    public String getType() { return this.type; }

    // Setter methods to allow modifying attributes
    public void setSize(String size) {
        if (size == null || size.trim().isEmpty()) {
            throw new IllegalArgumentException("Size cannot be empty.");
        }
        this.size = size;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color cannot be empty.");
        }
        this.color = color;
    }

    public void setGender(String gender) {
        if (gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Gender cannot be empty.");
        }
        this.gender = gender;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
        this.brand = brand;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Type cannot be empty.");
        }
        this.type = type;
    }

    /**
     * Returns a formatted string representation of the clothing item.
     *
     * @return A string containing product details and clothing attributes.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Size: " + size + "\n" +
                "Color: " + color + "\n" +
                "Gender: " + gender + "\n" +
                "Brand: " + brand + "\n" +
                "Type: " + type + "\n";
    }
}
