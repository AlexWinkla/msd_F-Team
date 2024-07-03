package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DrinkQueueTest {

    private DrinkQueue queue;

    @BeforeEach
    public void initializeQueue(){
        queue = new DrinkQueue(2);
    }

    //queue.offer() should return true
    @Test
    public void testOffer() {}

    //queue.offer() should return true
    @Test
    public void testOffer2() {}

    //queue.poll() should return initialized Drink
    @Test
    public void testPoll() {}

    //queue.remove() should return initialized Drink
    @Test
    public void testRemove() {}

    //queue.remove() should throw NoSuchElementException
    @Test
    public void testRemoveException(){}

    //queue.element() should return initialized Drink
    @Test
    public void testPeek(){}

    //queue.element() should return initialized Drink
    @Test
    public void testElement(){}

    //queue.element() should throw NoSuchElementException
    @Test
    public void testElementException(){}

}
