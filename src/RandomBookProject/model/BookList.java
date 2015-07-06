package RandomBookProject.model;

import java.util.List;


public class BookList {
    private final String bookListName;
    private List<Book> bookList;

    public BookList(String bookListName, List<Book> bookList) {
        this.bookListName = bookListName;
        this.bookList = bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public void removeBookList() {
        bookList.clear();
    }

    public int sizeBookList() {
        return bookList.size();
    }
}
