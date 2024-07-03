package at.fhj.msd;

import java.util.List;

public class Cocktail extends Drink{
    /**
     * Creates a Cocktail object with given name
     *
     * @param name name of the drink
     */


    public Cocktail(String name) {
        super(name);
    }

    /**
     * Creates a Cocktail object with given name and list of liquids
     *
     * @param name name of the drink
     */



    public Cocktail(String name, List<Liquid> liquids) {
        super(name, liquids);

    }



    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
