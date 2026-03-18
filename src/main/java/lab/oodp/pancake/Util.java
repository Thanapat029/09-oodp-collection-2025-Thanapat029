package lab.oodp.pancake;

public class Util {

    public static int randomValueBetwen(int lower, int upper) {
        return  (int)(Math.random() * (upper - lower + 1)) + lower;
    }
}