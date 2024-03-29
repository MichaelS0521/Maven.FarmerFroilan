package concreteclass;

import Abstract.Animal;
import Interface.Rideable;

public class Horse extends Animal implements Rideable {
<<<<<<< HEAD

    @Override
    public boolean ride() {
        return false;
    }
=======
    public boolean hasRider = false;
    public boolean hasEaten = false;

    public Horse(String name) {
        super(name);
    }

    @Override
    public boolean ride() {


        return false;
    }

    public void eat() {
        hasEaten = true;
    }

    @Override
    public String makesNoise() {
        return "Noise";
    }
>>>>>>> 0f4a46c4dd0499ecba8a5e19c7657f7c74a6522f
}
