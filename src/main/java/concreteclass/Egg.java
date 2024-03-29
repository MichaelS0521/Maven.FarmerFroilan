package concreteclass;

import Interface.Edible;

public class Egg implements Edible {
    @Override
    public boolean isEaten() {
        return false;
    }
}
