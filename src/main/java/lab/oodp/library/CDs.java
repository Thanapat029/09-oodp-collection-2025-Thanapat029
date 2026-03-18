package lab.oodp.library;

public class CDs extends LibraryItem implements Comparable<CDs> {

    private String artist;
    private String genre;

    // constructor
    public CDs(String title, String artist, String genre, Status status) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.status = status;
    }

    @Override
    public String toString() {
        return "CD by " + artist + " Album name:" + title + "(Genre:" + genre + ") Status:" + status;
    }

    @Override
    public int compareTo(CDs other) {
        return this.artist.compareTo(other.artist);
    }
}