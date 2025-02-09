package IntroToOOPProject;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    static int totalBooks = 0;
    ArrayList<Book> libraryBooks = new ArrayList<>();

    public Library(Book[] books) {
        for (Book book : books) {
            libraryBooks.add(book);
            totalBooks++;
        }
    }

    public void addBook(Book book) {
        libraryBooks.add(book);
        totalBooks++;
    }

    public void removeBook(String ISBN) {
        Iterator<Book> iterator = libraryBooks.iterator();
        while (iterator.hasNext()) {//means if there are more elements
            Book book = iterator.next(); // get the next book
            if (book.getISBN().equals(ISBN)) {
                iterator.remove();
                totalBooks--;
                break; // exist the loop after removing the book
            }
        }
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public void displayAllBooks() {
        if (totalBooks == 0) {
            System.out.print("No books available");
        }
        for (Book book : libraryBooks) {
            System.out.println(book.toString());
        }
    }

    public void searchBookByISBN(String ISBN) {
        for (Book book : libraryBooks) {
            if (book.getISBN().equals(ISBN)) {
                System.out.println(book.toString());
                return;
            }
        }
        System.out.println("Book not found");
    }
}
