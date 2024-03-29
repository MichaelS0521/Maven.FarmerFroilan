package concreteclass;

import Interface.Edible;

public class Tomato implements Edible {

    @Override
    public boolean edible() {
        return false;
    }

    private boolean isEaten = false;

    @Override
    public boolean isEaten() {
        return false;
    }

    @Override
    public void setEaten(boolean eaten) {

    }
}
