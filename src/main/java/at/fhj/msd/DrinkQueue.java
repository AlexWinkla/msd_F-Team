package at.fhj.msd;

import java.util.LinkedList;
import java.util.Queue;

public class DrinkQueue implements IQueue{

    private final String name;
    private final Queue<Drink> drinkQueue;

    public DrinkQueue(String name){
        this.name = name;
        drinkQueue = new LinkedList<>();
    }
    public DrinkQueue(String name, Queue<Drink> drinkQueue){
        this.name = name;
        this.drinkQueue = drinkQueue;
    }

    public void addDrink(Drink drink){
        drinkQueue.add(drink);
    }

    public Drink dequeue(){
        return drinkQueue.poll();
    }

    public boolean isEmpty(){
        return drinkQueue.isEmpty();
    }

    @Override
    public boolean offer(String obj) {
        return false;
    }

    @Override
    public String poll() {
        return "";
    }

    @Override
    public String remove() {
        return "";
    }

    @Override
    public String peek() {
        return "";
    }

    @Override
    public String element() {
        return "";
    }
}
