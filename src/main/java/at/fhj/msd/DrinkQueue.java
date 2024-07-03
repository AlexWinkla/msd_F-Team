package at.fhj.msd;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class DrinkQueue {

    private final int maxSize;
    private final Queue<Drink> drinkQueue;

    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
        drinkQueue = new LinkedList<>();
    }

    public DrinkQueue(int maxSize, Queue<Drink> drinkQueue) {
        this.maxSize = maxSize;
        this.drinkQueue = drinkQueue;
    }

    /**
     * Adds a Drink to the queue if the size is not greater than maxSize.
     *
     * @param drink the Drink to be added to the queue
     * @return true if the element was added, false otherwise
     */
    public boolean offer(Drink drink) {
        if (drinkQueue.size() >= maxSize)
            return false;
        drinkQueue.add(drink);
        return true;
    }

    /**
     * Removes and returns the first element in the queue.
     *
     * @return the first element in the queue, or null if the queue is empty
     */
    public Drink poll() {
        return drinkQueue.poll();
    }

    /**
     * Removes and returns the first element in the queue.
     * If the queue is empty, throws an exception.
     *
     * @return the first element in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Drink remove() {
        Drink drink = drinkQueue.poll();
        if (drink == null)
            throw new NoSuchElementException();
        return drink;
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first element of the queue, or null if the queue is empty
     */
    public Drink peek() {
        return drinkQueue.peek();
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     * If the queue is empty, throws an exception.
     *
     * @return the first element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Drink element() {
        Drink drink = drinkQueue.peek();
        if (drink == null)
            throw new NoSuchElementException();
        return drink;
    }
}
