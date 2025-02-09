package Java104ProjectContactManagementSystem;

/**
 * The Contact class represents a single contact entry
 * with a name, phone number, and email address.
 * It includes basic validation to ensure data integrity.
 *
 * @author [Abdul Baset Saleh]
 * @version 1.0
 */
public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    /**
     * Constructor to initialize a Contact object with validation.
     *
     * @param name        The contact's full name (cannot be empty).
     * @param phoneNumber The contact's phone number (must be 9-15 digits).
     * @param email       The contact's email address (must be in valid format).
     * @throws IllegalArgumentException if any input is invalid.
     */
    public Contact(String name, String phoneNumber, String email) {
        setName(name);  // Using setter to apply validation
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    /**
     * Gets the contact's name.
     *
     * @return The name of the contact.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the contact's name with validation.
     *
     * @param name The new name for the contact.
     * @throws IllegalArgumentException if the name is null or empty.
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    /**
     * Gets the contact's phone number.
     *
     * @return The phone number of the contact.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the contact's phone number with validation.
     * Accepts only numeric values with a length of 9 to 15 digits.
     *
     * @param phoneNumber The new phone number for the contact.
     * @throws IllegalArgumentException if the phone number format is invalid.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("\\d{9,15}")) { // Allows only numbers with length 9-15
            throw new IllegalArgumentException("Invalid phone number. Must be 9-15 digits.");
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the contact's email address.
     *
     * @return The email address of the contact.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the contact's email address with validation.
     * Ensures the email follows a proper format.
     *
     * @param email The new email address for the contact.
     * @throws IllegalArgumentException if the email format is invalid.
     */
    public void setEmail(String email) {
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        this.email = email;
    }

    /**
     * Returns a formatted string representation of the contact details.
     *
     * @return A string containing the contact's name, phone number, and email.
     */
    @Override
    public String toString() {
        return "Contact Details:\n" +
                "Name        : " + name + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email       : " + email;
    }
}
