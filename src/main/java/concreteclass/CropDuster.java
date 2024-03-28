package concreteclass;

import Interface.Aircraft;
import Interface.Fertilize;

public class CropDuster implements Aircraft, Fertilize {

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }
}
