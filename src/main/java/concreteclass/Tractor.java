package concreteclass;

import Abstract.Crop;
import Abstract.FarmVehicle;
import Interface.Harvest;
import collections.CropRow;


public class Tractor extends FarmVehicle implements Harvest  {

    @Override
    public boolean harvestCrop(CropRow<Crop> cropRow) {

//        for (int )
        for (Crop crop: cropRow){
            System.out.println(crop + " has been harvested");
        }
        return true;
    }

//    public void harvestCropsStored() {
//        Tractor tractor = new Tractor();
//        String[] crop = new String[] {
//                "corn",
//                "tomato",
//                "beetroot",
//        };
//        tractor.harvestCrop(crop);
//    }


    public boolean hasHarvested() {
        return false;
    }
}
