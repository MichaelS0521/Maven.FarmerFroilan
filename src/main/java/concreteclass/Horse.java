package concreteclass;

import Abstract.Animal;
import Abstract.Crop;
import Interface.Edible;
import Interface.Produce;
import Interface.Rideable;

public class Horse extends Animal implements Rideable {


    @Override
    public boolean ride() {
        if (hasRider == true) {
            return true;
        }
        return false;
    }

    public boolean hasRider = false;
    public boolean hasEaten = false;

    public Horse(String name) {
        super(name);
    }

    @Override
    public String makesNoise() {
        return "Noise";
    }



    @Override
    public void eat(Edible food) {
        hasEaten = true;

    }
}
