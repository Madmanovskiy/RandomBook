package RandomBookProject.model;


public class Book {
    private final String bookName;
    private final String Author;
    private final int yearOfpublishing;
    private final int numberOfPages;
    private final BookLanguages language;
    private final BookGenre genre;

    public Book(String bookName, String author, int yearOfpublishing, int numberOfPages, BookLanguages language, BookGenre genre) {
        this.bookName = bookName;
        this.Author = author;
        this.yearOfpublishing = yearOfpublishing;
        this.numberOfPages = numberOfPages;
        this.language = language;
        this.genre = genre;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYearOfpublishing() {
        return yearOfpublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public BookLanguages getLanguage() {
        return language;
    }

    public BookGenre getGenre() {
        return genre;
    }
}
