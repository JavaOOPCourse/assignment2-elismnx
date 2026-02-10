

public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {

        books = new Book[capacity];
        count = 0;
    }


    // TODO: Add book to array
    public Book addBook(Book book) {
        // implement

//        title,author,year
        if(count<books.length) {
            books[count] = book;
            count++;

        }else{
            System.out.println("No more space for a new book!");
        }
        return book;
    }

    // TODO: Display all books
    public void displayBooks() {
        // implement
        for(Book book: books){
            System.out.println(book);
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for(int i = 0;i<books.length;i++){
            if(title.equals(books[i].getTitle())){
                return books[i];
            }
        }
        System.out.println("Not Found");
        return null;

    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        // implement'
        for(Book b:books){
            if(title.equals(b.getTitle())){
//                books[b].isAvailable() = false;
                System.out.println("The book is borrowed");
            }
            System.out.println("Book was not found");
        }



    }

    // TODO: Return book by title
    public void returnBook(String title) {
        // implement
        for(Book s:books){
            if(title.equals(s.getTitle())){
//                books[s].isAvailable() = true;
                System.out.println("The book was returned");
            }
        }
    }
}
