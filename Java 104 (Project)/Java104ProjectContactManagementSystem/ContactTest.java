package Java104ProjectContactManagementSystem;

import java.util.List;
import java.util.Scanner;

/**
 * ContactTest class serves as the entry point for the Contact Management System.
 * It provides a menu-driven interface for users to add, update, delete, search,
 * and display contacts.
 *
 * @author [Abdul Baset Saleh]
 * @version 1.0
 */
public class ContactTest {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager(); // Manages contacts
        ContactStorage contactStorage = new ContactStorage(); // Handles file storage

        // Load existing contacts from file into the contact manager
        List<Contact> contacts = contactStorage.loadContacts();
        for (Contact contact : contacts) {
            contactManager.addContact(contact); // Load into manager
        }

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("""
                    \n📌 Contact Management System - Choose an option:
                    1. Add a contact
                    2. Update a contact
                    3. Delete a contact
                    4. Search a contact
                    5. Show all contacts
                    6. Exit
                    """);

            System.out.print("Your choice: ");
            while (!input.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter a number.");
                input.next(); // Consume invalid input
            }
            choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> { // Add Contact
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = input.nextLine();
                    System.out.print("Enter email: ");
                    String email = input.nextLine();

                    Contact newContact = new Contact(name, phone, email);
                    contactManager.addContact(newContact);
                }

                case 2 -> { // Update Contact
                    System.out.print("Enter name of contact to update: ");
                    String name = input.nextLine();
                    System.out.print("Enter new phone: ");
                    String phone = input.nextLine();
                    System.out.print("Enter new email: ");
                    String email = input.nextLine();

                    Contact updatedContact = new Contact(name, phone, email);
                    contactManager.updateContact(name, updatedContact);
                }

                case 3 -> { // Delete Contact
                    System.out.print("Enter name of contact to delete: ");
                    String name = input.nextLine();
                    contactManager.deleteContact(name);
                }

                case 4 -> { // Search Contact
                    System.out.print("Enter name of contact to search: ");
                    String name = input.nextLine();
                    contactManager.searchContact(name);
                }

                case 5 -> { // Show All Contacts
                    System.out.println("📖 Your contacts:");
                    contactManager.displayAllContacts();
                }

                case 6 -> { // Exit
                    System.out.println("💾 Contacts saved. Exiting...");
                }

                default -> System.out.println("❌ Invalid choice! Please try again.");
            }
        } while (choice != 6);

        input.close();
    }
}
