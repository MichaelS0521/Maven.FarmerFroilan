package AbstractTest;

import Abstract.FarmVehicle;
import concreteclass.CropDuster;
import concreteclass.Pilot;
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


    @Test
    public void rideTest(){
        Tractor tractor = new Tractor();
        tractor.ride();
        Assert.assertTrue(tractor.hasRider);
    }

    @Test
    public void makeNoise(){
        Tractor tractor = new Tractor();

        Assert.assertEquals("Noise", tractor.makeNoise());
    }


    }

