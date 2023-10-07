import java.util.ArrayList;
import java.util.List;

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Author author1 = new Author("John Doe");
        Author author2 = new Author("Jane Smith");

        Book book1 = new Book("Introduction to Java", author1, 2022);
        Book book2 = new Book("Advanced Java Programming", author2, 2023);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Library Books:");
        for (Book book : library.getBooks()) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println("Year: " + book.getYear());
            System.out.println();
        }
    }
}
