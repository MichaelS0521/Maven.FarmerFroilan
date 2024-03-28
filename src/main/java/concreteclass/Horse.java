package concreteclass;

import Abstract.Animal;
import Interface.Rideable;

public class Horse extends Animal implements Rideable {

    Horse myHorse = new Horse();


    @Override
    public boolean ride() {
        return false;
    }
}
