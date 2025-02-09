package Java104ProjectContactManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ContactStorage class is responsible for handling file-based
 * persistence for contact information.
 *
 * Contacts are stored in a text file in the user's home directory
 * for better accessibility and security.
 *
 * @author [Abdul Baset Saleh]
 * @version 1.0
 */
public class ContactStorage {
    private static final String FILE_NAME = System.getProperty("user.home") + "/contacts.txt";

    /**
     * Saves the list of contacts to a file.
     *
     * @param contacts The list of contacts to be saved.
     */
    public void saveContacts(List<Contact> contacts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Contact contact : contacts) {
                if (contact.getName() != null && contact.getPhoneNumber() != null && contact.getEmail() != null) {
                    writer.write(contact.getName() + "," + contact.getPhoneNumber() + "," + contact.getEmail());
                    writer.newLine(); // Move to the next line for the next contact
                }
            }
            System.out.println("✅ Contacts saved successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error saving contacts: " + e.getMessage());
        }
    }

    /**
     * Loads contacts from the file and returns a list of Contact objects.
     *
     * @return A list of contacts stored in the file.
     */
    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        File file = new File(FILE_NAME);

        // If the file doesn't exist, return an empty list without error
        if (!file.exists()) {
            System.out.println("📂 No existing contacts found. Creating a new list.");
            return contacts;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                // Validate the contact format before adding
                if (data.length == 3 && !data[0].isEmpty() && !data[1].isEmpty() && !data[2].isEmpty()) {
                    contacts.add(new Contact(data[0].trim(), data[1].trim(), data[2].trim()));
                } else {
                    System.out.println("⚠️ Skipping invalid contact entry: " + line);
                }
            }
            System.out.println("✅ Contacts loaded successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error loading contacts: " + e.getMessage());
        }

        return contacts;
    }
}
