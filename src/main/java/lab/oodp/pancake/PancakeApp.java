package lab.oodp.pancake;

import java.util.ArrayDeque;
import java.util.Deque;

public class PancakeApp {
	
    public PancakeShop shop;

    private void start() {
        shop.serveLunch();
    }

    public Deque<Customer> createCustomerQueue() {

        NameGenerator nameGen = new NameGenerator();
        int numCustomers = Util.randomValueBetwen(100, 200);

        Deque<Customer> queue = new ArrayDeque<>();

        for (int i = 1; i <= numCustomers; i++) {

            int bellySize = Util.randomValueBetwen(1, 10);
            Customer customer = new Customer(bellySize, nameGen.getRandomName(), i);

            queue.addLast(customer);
        }

        return queue;
    }

    public static void main(String[] args) {
        PancakeApp pancakeApp = new PancakeApp();
        Deque<Customer> customers = pancakeApp.createCustomerQueue();
        pancakeApp.shop = new PancakeShop("PancakeTopia", customers);
        pancakeApp.start();
    }
}