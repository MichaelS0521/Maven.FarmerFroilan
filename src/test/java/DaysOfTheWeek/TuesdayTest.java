package DaysOfTheWeek;

// Froilan and Froilanda (riders)
// ride each horse (rideable) <array>
// in each stable <array>
// Horse (Eater)
// Horse eats() 3 earCorn
// Froilan eater()
// Froilan eats() 1 earCorn, 2 Tomato, 5 Eggs
// Froilanda eater()
// Froilanda eats() 2 earCorn, 1 Tomato, 2 Eggs

/* Every Tuesday... */
// Froilan is a Farmer
// Froilan can ride
//tractor is rideable
// Tractor can harvest
// Tractor can harvest each crop in cropRows

import Abstract.Crop;
import Interface.Rideable;
import Interface.Rider;
import collections.CropRow;
import concreteclass.Farmer;
import concreteclass.TomatoPlant;
import concreteclass.Tractor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TuesdayTest {

    @Test
    public void froilanIsAFarmerTest() {
        Farmer froilan = new Farmer();

        Assert.assertTrue(froilan instanceof Farmer);
    }

    @Test
    public void froilanCanRideTest() {
        Farmer froilan = new Farmer();



        Assert.assertTrue(froilan instanceof Rider);

    }
    @Test
    public void tractorIsRideable(){
        Tractor tractor = new Tractor();

        Assert.assertTrue(tractor instanceof Rideable);
    }

    @Test

    public void tractorCanHarvest() {
        Tractor tractor = new Tractor();
        boolean expected = tractor.hasHarvested();


        Assert.assertFalse(expected);


    }

    @Test
    public void tractorHarvestEachCrop(){
        Tractor tractor = new Tractor();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow<Crop> cropRowOne = new CropRow<>();

        Assert.assertTrue(tractor.harvestCrop(cropRowOne));


//        boolean expectedCropRowsFertilized = false;
//        for (int i = 0; i < 12; i++) {
//            cropRowOne.add(tomatoPlant);


    }

}
