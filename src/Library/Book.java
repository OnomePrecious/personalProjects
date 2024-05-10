package Library;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private List <Book> books = new ArrayList<>();

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public List<Book> getBooks() {
        return books;
    }


}
