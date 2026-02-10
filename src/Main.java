import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add
                    System.out.println("Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Author: ");
                    String author = scanner.nextLine();
                    System.out.println("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    library.addBook(new Book(title,author,year));
                    break;

                case 2:
                    // TODO: Read input and add EBook
                    System.out.println("Title: ");
                    String eTitle = scanner.nextLine();
                    System.out.println("Author: ");
                    String eAuthor = scanner.nextLine();
                    System.out.println("Year: ");
                    int eYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("File Size: ");
                    double filesize = scanner.nextDouble();
                    library.addBook(new EBook(eTitle,eAuthor,eYear,filesize));
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    System.out.println("The title of the book: ");
                    String searchTitle = scanner.nextLine();
                    var c = library.searchByTitle(searchTitle);
                    if(c!=null){
                        System.out.println(c.toString());
                    }
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.println("Book: ");
                    String d = scanner.nextLine();
                    library.borrowBook(d);


                    break;

                case 6:
                    // TODO: Return book
                    System.out.println("Book: ");
                    String r = scanner.nextLine();
                    library.returnBook(r);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
