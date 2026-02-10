import java.util.ArrayList;
import java.util.List;

public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        // implement
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
        this.isAvailable = other.isAvailable;
    }



    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        // implement
        if(this.isAvailable) {
            this.isAvailable = false;
            System.out.println("you take the book");
        }else {
            System.out.println("the book is not available!!!");
        }

    }

    // TODO: Implement return logic
    public void returnBook() {
        // implement
        if(this.isAvailable) {
            System.out.println("you returned the book");
        }else {
            System.out.println("you haven`t returned the book ");
        }

    }

    // TODO: Override toString()
    @Override
    public String toString() {
        String s = "Title: " + title + "\nAuthor: " + author + "\nYear: " + year + "\nAvailable: " + this.isAvailable;
        return s;
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (!(obj instanceof Book other)) return false;
        return this.title.equals(other.title) &&
                this.author.equals(other.author) &&
                this.year == other.year;
    }
}
