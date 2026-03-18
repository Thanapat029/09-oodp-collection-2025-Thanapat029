package lab.oodp.pancake;

import java.util.Deque;

public class Customer {

    private int bellySize;
    private String name;
    private int number;

    public Customer(int bellySize, String name, int number) {
        this.bellySize = bellySize;
        this.name = name;
        this.number = number;
    }

    public void eat(Deque<Pancake> pancakes) throws HungryException {

        int desiredMealSize = this.bellySize;

        while (desiredMealSize > 0) {

            Pancake p = pancakes.pollFirst();

            if (p != null) {

                System.out.println(getName() + " ate " + p + "!");
                desiredMealSize--;

            } else {
                throw new HungryException(getName() + " is still hungry!");
            }
        }

        System.out.println(getName() + " ate " + this.bellySize + " pancakes in total!");
    }

    public String getName() {
        return name + " ["+number+"]";
    }

    public int getBellySize() {
        return bellySize;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}