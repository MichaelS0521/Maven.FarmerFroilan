package concreteclass;

import Abstract.Animal;
import Interface.Eater;
import Interface.Edible;
import Interface.Produce;

public class Chicken extends Animal implements Produce {

    private Egg egg = new Egg();
    private boolean isFertilized = false;

    public Chicken(String name) {
        super(name);
    }
    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }
    public boolean isFertilized() {
        return isFertilized;
    }

    @Override
    public Egg yield() {
        if (!isFertilized()) {
            return egg;
        }
        return null;
    }

//    @Override
//    public Edible yield() {
//        return null;
//    }

    @Override
    public void eat(Edible food) {


    }

    @Override
    public String makesNoise() {
        return null;
    }


}
