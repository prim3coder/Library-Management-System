import java.util.ArrayList;
import java.io.*;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Code by Abel Wondem

    // Adding Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Removing Book
    public void removeBook(String ISBN) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                System.out.println("Book removed: " + books.get(i).getTitle());
                books.remove(i);
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found");
    }

    // Code by Kevin

    // Search for Book
    public void searchBook(String keyword) {

        boolean found = false;

        String lowerKeyword = keyword.toLowerCase();

        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);

            if (b.getTitle().toLowerCase().contains(lowerKeyword) ||
                    b.getAuthor().toLowerCase().contains(lowerKeyword) ||
                    b.getISBN().equals(keyword)) {

                System.out.println(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    // Display Books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    // Code by Jose

    // Check out Book
    public void checkOutBook(String ISBN) {

        for (int i = 0; i < books.size(); i++) {

            Book book = books.get(i);

            if (book.getISBN().equals(ISBN)) {

                // Checking if already checked out
                if (!book.isAvailable()) {
                    System.out.println("Book is already checked out");
                    return;
                }

                book.setAvailable(false);
                System.out.println("Book checked out successfully");
                return;
            }
        }

        System.out.println("Book not found");
    }

    // Return Book
    public void returnBook(String ISBN) {

        for (int i = 0; i < books.size(); i++) {

            Book book = books.get(i);

            if (book.getISBN().equals(ISBN)) {

                if (book.isAvailable()) {
                    System.out.println("Book was not checked out");
                    return;
                }

                // Changes status to available
                book.setAvailable(true);
                System.out.println("Book returned successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    // Load books from file
    public void loadBooksFromFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 4) {
                    String title = data[0];
                    String author = data[1];
                    String ISBN = data[2];
                    int publicationYear = Integer.parseInt(data[3]);

                    Book book = new Book(title, author, ISBN, publicationYear);
                    books.add(book);
                } else {
                    System.out.println("Invalid book data format: " + line);

                }
            }

            reader.close();
            System.out.println("Books loaded from file: " + filename);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
