package concreteclass;

import Interface.Harvest;

public class Tractor implements Harvest {
    @Override
    public boolean harvestCrop() {
        return false;
    }
}
