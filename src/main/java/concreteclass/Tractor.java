package concreteclass;

import Interface.Harvest;


public class Tractor implements Harvest {
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
