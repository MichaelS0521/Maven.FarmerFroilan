package concreteclass;

import Interface.Edible;

public class Tomato implements Edible {
<<<<<<< HEAD
    @Override
    public boolean edible() {
        return false;
    }
=======
    private boolean isEaten = false;

    @Override
    public boolean isEaten() {
        return false;
    }

    @Override
    public void setEaten(boolean eaten) {

    }
>>>>>>> 0f4a46c4dd0499ecba8a5e19c7657f7c74a6522f
}
