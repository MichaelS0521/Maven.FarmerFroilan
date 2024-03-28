package concreteclass;

import Abstract.Animal;
import Interface.Rideable;

public class Horse extends Animal implements Rideable {
    public Horse(String name) {
        super(name);
    }

    @Override
    public boolean ride() {
        return false;
    }
}
