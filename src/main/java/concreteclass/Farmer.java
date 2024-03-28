package concreteclass;

import Interface.Botanist;

public class Farmer implements Botanist {

    @Override
    public boolean plant() {
        return false;
    }
}
