package lab.oodp.library;

public class Book {

    private String title;
    private String status;

    public Book(String title) {
        this.title = title;
        this.status = "available";
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void borrow() {
        status = "borrowed";
    }

    public void returned() {
        status = "available";
    }

    @Override
    public String toString() {
        return title + " (" + status + ")";
    }
}