package concreteclass;

import Abstract.Animal;
import Interface.Edible;
import Interface.Produce;

public class Chicken extends Animal implements Produce {
    @Override
    public Edible yield() {
        return null;
    }

    @Override
    public void eat() {

    }
}
