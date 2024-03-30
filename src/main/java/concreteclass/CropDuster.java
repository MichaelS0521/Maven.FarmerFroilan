package concreteclass;

import Abstract.Crop;
import Interface.Aircraft;
import Interface.Fertilize;
import collections.CropRow;

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
