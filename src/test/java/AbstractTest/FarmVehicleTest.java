package AbstractTest;

import Abstract.FarmVehicle;
import concreteclass.CropDuster;
import concreteclass.Tractor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FarmVehicleTest {
    @Test
        public void addTractorTest(){
            Tractor tractor = new Tractor();
            FarmVehicle farmVehicle = new FarmVehicle();
            farmVehicle.add(tractor);


            Assert.assertTrue(farmVehicle.contains(tractor) );
        }
        @Test
        public void addCropDusterTest(){
            CropDuster cropduster = new CropDuster();
            FarmVehicle farmVehicle = new FarmVehicle();
            farmVehicle.add(cropduster);

            Assert.assertTrue(farmVehicle.contains(cropduster));
        }
    }

