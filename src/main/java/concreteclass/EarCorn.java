package concreteclass;

import Interface.Edible;

public class EarCorn implements Edible {
    @Override
    public boolean edible() {
        return false;
    }
}
