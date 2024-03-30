package concreteclass;

import Abstract.FarmVehicle;
import Interface.Harvest;

public class Tractor extends FarmVehicle implements Harvest  {

    @Override
    public boolean harvestCrop() {
        return false;
    }

}
