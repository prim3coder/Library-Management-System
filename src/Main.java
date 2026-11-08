import java.util.Scanner;

// Code by Abel
public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display ALL Books");
            System.out.println("5. Check Out Book");
            System.out.println("6. Return Book");
            System.out.println("7. Load Books From File");
            System.out.println("8. Exit");

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    Book newBook = new Book(title, author, isbn, year);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter ISBN: ");
                    library.removeBook(scanner.nextLine());
                    break;

                // Code by Kevin
                case 3:
                    System.out.print("Enter keyword: ");
                    library.searchBook(scanner.nextLine());
                    break;

                case 4:
                    library.displayBooks();
                    break;

               // Code by Kevin

                case 5:
                    System.out.print("Enter ISBN: ");
                    library.checkOutBook(scanner.nextLine());
                    break;

                case 6:
                    System.out.print("Enter ISBN: ");
                    library.returnBook(scanner.nextLine());
                    break;

                case 7:
                    System.out.print("Enter filename: ");
                    library.loadBooksFromFile(scanner.nextLine());
                    break;

                case 8:
                    System.out.println("Exiting... ");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 8);
        scanner.close();
    }
}
