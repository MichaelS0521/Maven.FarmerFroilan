package concreteclass;

import Abstract.Crop;
import Abstract.FarmVehicle;
import Interface.Aircraft;
import Interface.Fertilize;
import collections.CropRow;

import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class CropDuster extends CropRow implements Aircraft {

    @Override
    public boolean fly() {
        return true;
    }


    public void fertilize(CropRow<Crop> cropRowOne) {
    }

    public boolean hasPilot() {
        return false;
    }

}
