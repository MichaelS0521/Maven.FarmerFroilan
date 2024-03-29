package concreteclass;

import Interface.Edible;

public class EarCorn implements Edible {
    @Override
    public boolean isEaten() {
        return false;
    }
}
