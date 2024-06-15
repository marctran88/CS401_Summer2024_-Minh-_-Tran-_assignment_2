public class Book extends Product {
    private String author;
    private String genre;

    public Book(String id, String name, double price, String author, String genre) {
        super(id, name, price);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}