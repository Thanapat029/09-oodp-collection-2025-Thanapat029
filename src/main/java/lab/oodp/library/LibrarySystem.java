package lab.oodp.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibrarySystem {

    public void start() {

        // create lists
        List<Book> bookList = new ArrayList<>();
        List<CDs> CdsList = new ArrayList<>();

        // add books
        bookList.add(new Book("To Kill a Mockingbird", "John Doe", "978-0061120084", Status.AVAILABLE));
        bookList.add(new Book("1984", "George Orwell", "978-0451524935", Status.AVAILABLE));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", Status.AVAILABLE));

        // add CDs
        CdsList.add(new CDs("Thriller", "Michael Jackson", "Pop", Status.AVAILABLE));
        CdsList.add(new CDs("The Dark Side of the Moon", "Pink Floyd", "Rock", Status.AVAILABLE));
        CdsList.add(new CDs("Abbey Road", "The Beatles", "Rock", Status.AVAILABLE));

        System.out.println("Displaying all books sorting from book titles");

        // sort books
        Collections.sort(bookList);

        displayBookItems(bookList);

        System.out.println("*************************************");

        System.out.println("Displaying all CDs sorting from Cds Artist");

        // sort CDs
        Collections.sort(CdsList);

        displayCDItems(CdsList);
    }

    public static void main(String[] args) {
        new LibrarySystem().start();
    }

    public static void displayCDItems(List<CDs> CDsitems) {
        for (CDs item : CDsitems) {
            System.out.println(item);
        }
    }

    public static void displayBookItems(List<Book> bookitems) {
        for (Book item : bookitems) {
            System.out.println(item);
        }
    }
}