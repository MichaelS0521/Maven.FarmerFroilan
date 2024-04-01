package AbstractTest;

import Abstract.FarmVehicle;
import Interface.Rideable;
import Interface.Rider;
import concreteclass.CropDuster;
import concreteclass.CropDusterTest;
import concreteclass.Tractor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FarmVehicleTest {

    //ability to add a tractor to farm vehicle test
    @Test
    public void addTractorToFarmVehicleTest(){
        Tractor tractor = new Tractor();
        FarmVehicle farmVehicle = new FarmVehicle();
        farmVehicle.add(tractor);

        int expectedSize = 1;
        int actualSize = farmVehicle.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    //ability to add a cropduster to farm vehicle test
    @Test
    public void addCropDusterToFarmVehicleTest(){
        CropDuster cropDuster = new CropDuster();
        FarmVehicle farmVehicle = new FarmVehicle();
        farmVehicle.add(cropDuster);

        Assert.assertTrue(farmVehicle.contains(cropDuster));
    }

    //testing if these vehicles are rideable
    @Test
    public void  isTractorRideable() {
        FarmVehicle tractor = new FarmVehicle();
        Assert.assertTrue(tractor instanceof Rideable);
    }

    @Test
    public void isCropDusterRideable() {

    FarmVehicle cropDuster = new FarmVehicle();
        Assert.assertTrue(cropDuster instanceof Rideable);

    }
}

  
  


