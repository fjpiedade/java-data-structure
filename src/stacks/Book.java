package stacks;

public class Book {
    private String name;
    private String isbn;
    private int releaseYear;

    public Book(String name, String isbn, int releaseYear) {
        this.name = name;
        this.isbn = isbn;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", isbn=" + isbn + ", releaseYear=" + releaseYear + "]";
    }

}
