package CRUDDemoOperations;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="demo_book_table")
public class Book 
{
    @Id
    @Column(name="bid")
    private int id;
    @Column(name="btitle", length = 100, nullable = false)
    private String title;
    @Column(name="bauthor", length = 50, nullable = false)
    private String author;
    @Column(name="bgenre", length = 30, nullable = false)
    private String genre;
    @Column(name="bprice", nullable = false)
    private double price;
    @Column(name="bisbn", length = 20, nullable = false, unique = true)
    private String isbn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
