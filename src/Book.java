import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publisher;

    public Book(String name, Author author, int publisher) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public int getPublisher() {
        return publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }


    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author)&&Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publisher);
    }
}

