package lab.oodp.library;

public class CDs extends LibraryItem implements  Comparable<CDs>{
    private String artist;
    private String genre;

    //TODO: Implement a constructor that takes 4 parameters ( title, artist, genre, status) to initialize their values.
 




    
    @Override
    public String toString() {
        return "CD by " + artist + " Album name:" +  title + "(Genre:" + genre + ")" + " Status:" + status;
        
    }

     //TODO: implement method compareTo(Cds other) by comparing  artist names
     @Override
     public int compareTo(CDs other) {
         return 0;
     }

}
