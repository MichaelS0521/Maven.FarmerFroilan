package concreteclass;

import Interface.Edible;

public class Egg implements Edible {
    @Override
    public boolean edible() {
        return false;
    }
}
