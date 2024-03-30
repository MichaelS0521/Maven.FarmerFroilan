package AbstractTest;

import Abstract.FarmVehicle;
import Interface.Rider;
import concreteclass.CropDusterTest;
import concreteclass.Tractor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FarmVehicleTest {
    @Test
    //ability to add a tractor to farm vehicle test
        public void addTractorToFarmVehicleTest(){
            Tractor tractor = new Tractor();
            FarmVehicle farmVehicle = new FarmVehicle();
            farmVehicle.add(tractor);


            Assert.assertTrue(farmVehicle.contains(tractor) );
        }

        //ability to add a cropduster to farm vehicle test
        @Test
        public void addCropDusterToFarmVehicleTest(){
            CropDusterTest cropduster = new CropDusterTest();
            FarmVehicle farmVehicle = new FarmVehicle();
            farmVehicle.add(cropduster);

            Assert.assertTrue(farmVehicle.contains(cropduster));
        }
        //testing if these vehicles are rideable
        @Test
        public void  isTractorRideable() {
            FarmVehicle tractor = new FarmVehicle();
            Assert.assertTrue(tractor instanceof Rider);
        }
        @Test
        public void isCropDusterRideable() {

        FarmVehicle cropDuster = new FarmVehicle();
            Assert.assertTrue(cropDuster instanceof Rider);

        }
}

  
  


