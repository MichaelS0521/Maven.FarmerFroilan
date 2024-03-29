package concreteclass;


import Interface.Harvest;

public class Tractor implements Harvest {

import Abstract.FarmVehicle;
import Interface.Harvest;

public class Tractor extends FarmVehicle implements Harvest  {

    @Override
    public boolean harvestCrop() {
        return false;
    }

}
