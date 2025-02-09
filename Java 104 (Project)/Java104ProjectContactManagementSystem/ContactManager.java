package Java104ProjectContactManagementSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * The ContactManager class manages a collection of contacts,
 * providing functionalities such as adding, updating, deleting,
 * searching, and displaying contacts.
 *
 * It ensures data persistence by saving contacts to a file
 * after every modification.
 *
 * @author [Abdul Baset Saleh]
 * @version 1.0
 */
public class ContactManager {
    private List<Contact> contactList = new ArrayList<>();
    private ContactStorage contactStorage = new ContactStorage(); // Handles file storage

    /**
     * Constructor - Initializes the contact manager by loading
     * contacts from file storage when the program starts.
     */
    public ContactManager() {
        contactList = contactStorage.loadContacts();
    }

    /**
     * Adds a new contact to the contact list.
     * Prevents adding duplicate contacts by name.
     *
     * @param contact The contact object to be added.
     */
    public void addContact(Contact contact) {
        if (findContactByName(contact.getName()) != null) {
            System.out.println("❌ Contact with this name already exists.");
            return;
        }
        contactList.add(contact);
        saveContacts(); // Save after adding
        System.out.println("✅ Contact added successfully.");
    }

    /**
     * Updates an existing contact's phone number and email.
     * Keeps the same name but modifies other details.
     *
     * @param name       The name of the contact to update.
     * @param newContact A Contact object with updated details.
     */
    public void updateContact(String name, Contact newContact) {
        Contact existingContact = findContactByName(name);
        if (existingContact == null) {
            System.out.println("❌ Contact not found.");
            return;
        }
        existingContact.setPhoneNumber(newContact.getPhoneNumber());
        existingContact.setEmail(newContact.getEmail());
        saveContacts(); // Save after updating
        System.out.println("✅ Contact updated successfully.");
    }

    /**
     * Deletes a contact from the contact list by name.
     *
     * @param name The name of the contact to delete.
     * @return true if the contact was found and deleted, false otherwise.
     */
    public boolean deleteContact(String name) {
        Contact contact = findContactByName(name);
        if (contact == null) {
            System.out.println("❌ Contact not found.");
            return false;
        }
        contactList.remove(contact);
        saveContacts(); // Save after deleting
        System.out.println("✅ Contact deleted successfully.");
        return true;
    }

    /**
     * Searches for a contact by name.
     *
     * @param name The name of the contact to search for.
     * @return The Contact object if found, otherwise null.
     */
    public Contact searchContact(String name) {
        Contact contact = findContactByName(name);
        if (contact == null) {
            System.out.println("❌ Contact not found.");
        } else {
            System.out.println("🔍 Found: " + contact);
        }
        return contact;
    }

    /**
     * Displays all contacts stored in the contact list.
     */
    public void displayAllContacts() {
        if (contactList.isEmpty()) {
            System.out.println("📂 No contacts available.");
            return;
        }
        System.out.println("📖 Contact List:");
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    /**
     * Saves the contact list to file storage after any modification.
     */
    private void saveContacts() {
        contactStorage.saveContacts(contactList);
    }

    /**
     * Helper method to find a contact by name.
     *
     * @param name The name of the contact to search for.
     * @return The Contact object if found, otherwise null.
     */
    private Contact findContactByName(String name) {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }
}
