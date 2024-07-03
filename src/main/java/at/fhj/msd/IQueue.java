package at.fhj.msd;

import java.util.NoSuchElementException;

public interface IQueue {

  /**
   * Adds an object to the queue if the size is not greater than maxSize.
   *
   * @param obj the String to be added to the queue
   * @return true if the element was added, false otherwise
   */
  public abstract boolean offer(String obj);

  /**
   * Removes and returns the first element in the queue.
   *
   * @return the first element in the queue, or null if the queue is empty
   */
  public abstract String poll();

  /**
   * Removes and returns the first element in the queue.
   * If the queue is empty, throws an exception.
   *
   * @return the first element in the queue
   * @throws NoSuchElementException if the queue is empty
   */
  public abstract String remove();

  /**
   * Retrieves, but does not remove, the first element of the queue.
   *
   * @return the first element of the queue, or null if the queue is empty
   */
  public abstract String peek();

  /**
   * Retrieves, but does not remove, the first element of the queue.
   * If the queue is empty, throws an exception.
   *
   * @return the first element of the queue
   * @throws NoSuchElementException if the queue is empty
   */
  public abstract String element();
}