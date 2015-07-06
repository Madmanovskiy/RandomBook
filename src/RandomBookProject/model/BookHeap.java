package RandomBookProject.model;

import RandomBookProject.model.exceptions.IncorrectNameException;
import RandomBookProject.model.exceptions.ListWithSameNameIsAlreadyUseException;
import RandomBookProject.model.exceptions.ThereIsNoSuchBookException;

import java.util.Map;

public class BookHeap {
    private Map<String, BookList> bookListMap;

    public BookList getBookList(String name) throws ThereIsNoSuchBookException, IncorrectNameException {

        if (!bookListMap.containsKey(name)) throw new ThereIsNoSuchBookException();
        if (name == null || name.equals("")) throw new IncorrectNameException();

        return bookListMap.get(name);
    }

    public int getSize() {
        return bookListMap.size();
    }

    public void addBookListToMap(String name, BookList bookList) throws ListWithSameNameIsAlreadyUseException, IncorrectNameException {

        if (bookListMap.containsKey(name)) throw new ListWithSameNameIsAlreadyUseException();
        if (name == null || name.equals("")) throw new IncorrectNameException();

        bookListMap.put(name, bookList);
    }

    public void removeBookListFromMap(String name) throws IncorrectNameException {

        if (!bookListMap.containsKey(name) || name == null || name.equals("")) throw new IncorrectNameException();

        bookListMap.remove(name);
    }
}
