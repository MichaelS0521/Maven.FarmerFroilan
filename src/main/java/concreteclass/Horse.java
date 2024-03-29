package concreteclass;

import Abstract.Animal;
import Interface.Rideable;

public class Horse extends Animal implements Rideable {


    @Override
    public boolean ride() {
        return false;
    }

    public boolean hasRider = false;
    public boolean hasEaten = false;

    public Horse(String name) {
        super(name);
    }

    public void eat() {
        hasEaten = true;
    }

    @Override
    public String makesNoise() {
        return "Noise";
    }
}
