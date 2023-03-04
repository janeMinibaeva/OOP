package HW2.TASK3;

public class Book {

    private String bookTitle;
    private String Author;
    private String genre;
    private int yearOfPublication;

    public Book(String bookTitle, String author, String genre, int yearOfPublication) {
        this.bookTitle = bookTitle;
        Author = author;
        this.genre = genre;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return Author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", Author='" + Author + '\'' +
                ", genre='" + genre + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
