package lab.oodp.library;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    private List<Book> bookList = new ArrayList<>();
    private List<CDs> cdsList = new ArrayList<>();

    public void addBook(Book book) {
        if (book == null) throw new NullPointerException();
        bookList.add(book);
    }

    public void addCD(CDs cd) {
        if (cd == null) throw new NullPointerException();
        cdsList.add(cd);
    }

    public List<Book> getBooks() {
        return bookList;
    }

    public List<CDs> getCDs() {
        return cdsList;
    }

    public Book findBook(String title) {
        for (Book b : bookList) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }

    public CDs findCD(String title) {
        for (CDs c : cdsList) {
            if (c.getTitle().equals(title)) {
                return c;
            }
        }
        return null;
    }
}