package concreteclass;

import Interface.Edible;

public class Egg implements Edible {
    
    private boolean isEaten = false;

    @Override
    public boolean edible() {
        return false;
    }

    @Override
    public boolean isEaten() {
        return isEaten();
    }

    @Override

    public void setEaten(boolean eaten){
            isEaten = eaten;
    }
}