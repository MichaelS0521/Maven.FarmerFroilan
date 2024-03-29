package concreteclass;

import Abstract.FarmVehicle;
import Interface.Harvest;


public class Tractor extends FarmVehicle implements Harvest  {

    @Override
    public boolean harvestCrop(String[] cropRow) {
        for (String crop: cropRow){
            System.out.println(crop + " has been harvested");
        }
        return false;
    }

    public static void main(String[] args) {
        Tractor tractor = new Tractor();
        String[] crop = new String[] {
                "corn",
                "tomato",
                "beetroot",
        };
        tractor.harvestCrop(crop);
    }
}
