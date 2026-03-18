package lab.oodp.pancake;

public class Pancake {

    private int number;

    public Pancake(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Pancake #" + number;
    }
}