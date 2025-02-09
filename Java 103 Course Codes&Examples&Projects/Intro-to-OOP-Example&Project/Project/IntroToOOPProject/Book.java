package IntroToOOPProject;
public class Book {
    private String title;
    private String author;
    private double price;
    private  final String ISBN;
    public Book(String title, String author, double price, String ISBN) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        if (price < 0){
            throw  new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book Details:\n"
                + "-------------"
                + "\nTitle: " + title
                + "\nAuthor: " + author
                + "\nPrice: $" + price
                + "\nISBN: " + ISBN;
    }
}
