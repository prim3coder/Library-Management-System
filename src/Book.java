public class Book {

    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private boolean isAvailable;

    // Constructor / Code by Abel
    public Book(String title, String author, String ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.isAvailable = true; // Books available by default
    }

    // Returns the book title
    public String getTitle() {
        return title;
    }

    // Returns the book author
    public String getAuthor() {
        return author;
    }

    // Returns ISBN
    public String getISBN() {
        return ISBN;
    }

    // Returns publicationYear
    public int getPublicationYear() {
        return publicationYear;
    }

    // Returns true if book is available
    public boolean isAvailable() {
        return isAvailable;
    }

    // Changes availability status
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Retrieves formatted book information
    public String toString() {
        return "Title: " + title +
                "\nAuthor: " + author +
                "\nISBN: " + ISBN +
                "\nPublication Year: " + publicationYear +
                "\nStatus: " + (isAvailable ? "Available" : "Checked Out");
    }
}
