package IntroToOOPProject;
public class LibraryBookTest {
    public static void main(String[] args) {
        //1) create objects from book class
        Book book1 = new Book("Java", "Abdul Baset🤓", 1000.12, "123321123");
        Book book2 = new Book("SQL", "Sarah💌", 1020.12, "123322213");
        Book book3 = new Book("Programming Skills", "Mohammed😍", 1200.12, "1233215432");

        //2) I create a library to add the books that I created above
        Book [] books = {book1, book2, book3};
        Library library = new Library(books);

        //3) I display all the books that I added
        library.displayAllBooks();

        //4) I try to remove the book using the ISBN
        System.out.println("The books after removing!⬇️⬇️");
        library.removeBook("123321123");
        library.displayAllBooks();

        //5) I try to search for book by ISBN
        System.out.println("⬇️⬇️The book that we got it using ISBN⬇️⬇️");
        library.searchBookByISBN("1233215432");
        library.searchBookByISBN("123321123"); // not founded , because I remove it above😍
    }
}
