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
    public void testOffer() {
        final boolean expected = true;
        boolean actual = queue.offer(new SimpleDrink("Bier", new Liquid("Bier", 0.4, 0.14)));
        assertEquals(expected, actual);
    }

    //queue.offer() should return true
    @Test
    public void testOffer2() {
        final boolean expected = false;
        queue.offer(new SimpleDrink("Bier", new Liquid("Bier", 0.4, 0.14)));
        queue.offer(new SimpleDrink("Vino", new Liquid("Vino", 1.2, 0.2)));
        boolean actual = queue.offer(new SimpleDrink("Vodka", new Liquid("Vodka", 0.7, 0.35)));
        assertEquals(expected, actual);
    }

    //queue.poll() should return initialized Drink
    @Test
    public void testPoll() {
        Drink drink = new SimpleDrink("Vino", new Liquid("Vino", 1.2, 0.2));
        queue.offer(drink);
        Drink actual = queue.poll();
        assertEquals(drink, actual);
    }

    //queue.remove() should return initialized Drink
    @Test
    public void testRemove() {
        Drink drink = new SimpleDrink("Vino", new Liquid("Vino", 1.2, 0.2));
        queue.offer(drink);
        Drink actual = queue.remove();
        assertEquals(drink, actual);
    }

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
