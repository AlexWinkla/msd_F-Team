package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;      // maximum size of arraylist

  public StringQueue(int maxsize) {
    maxSize = maxSize;
  }


  /**
   *
   * @param obj adds an obj to the queue if the size is not greater than maxSize
   * @return returns true if element was added else false
   */

  @Override
  public boolean offer(String obj) {
    if (elements.size() < maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * Removes the first element
   * @return String from the first removed element
   */

  @Override
  public String poll() {
    String element = peek();

    if (!elements.isEmpty()) {
      elements.remove(0);
    }

    return element;
  }

  /**
   *  Sets element to ""
   * @return String of the element
   */



  @Override
  public String remove() {
    String element = poll();
    element = "";

      return element;
  }

  /**
   *  Looks at the first element
   * @return String of the first element or null if nothing left
   */


  @Override
  public String peek() {
    String element;
    if (!elements.isEmpty())
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   *  checks if there are elements left
   * @return String of the first element if null throw exception
   */

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}