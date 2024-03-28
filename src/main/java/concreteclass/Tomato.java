package concreteclass;

import Interface.Edible;

public class Tomato implements Edible {
    @Override
    public boolean edible() {
        return false;
    }
}
