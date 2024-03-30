package DaysOfTheWeek;

import Abstract.Crop;
import Interface.Botanist;
import Interface.Rideable;
import Interface.Rider;
import collections.CropRow;
import collections.Stables;
import concreteclass.*;
import org.junit.Assert;
import org.junit.Test;

// Froilan and Froilanda (riders)
// ride each horse (rideable) <array>
// in each stable <array>
// Horse (Eater)
// Horse eats() 3 earCorn
// Froilan eater()
// Froilan eats() 1 earCorn, 2 Tomato, 5 Eggs
// Froilanda eater()
// Froilanda eats() 2 earCorn, 1 Tomato, 2 Eggs

/* Just for sunday */
// Froilan is a Botanist()
// Froilan plants() in a tomato() in a cropRowOne()
// Froilan plants() in a Corn() in a cropRowTwo()
// Froilan plants() in a Wheat() in a cropRowThree()

public class SundayTest {

    @Test
    public void personRiderTest() {
        Pilot froilanda = new Pilot();
        Farmer froilan = new Farmer();

        Assert.assertTrue(froilan instanceof Rider);
        Assert.assertTrue(froilanda instanceof Rider);
    }

    @Test
    public void horseRideable() {
        Horse horse = new Horse("horse");

        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void eachHorseIsRiddenStableOneTest() {
        Stables stableOne = new Stables();
        Horse horse = new Horse("horse1");
        Horse horse2 = new Horse("horse2");
        Horse horse3 = new Horse("horse3");
        Horse horse4 = new Horse("horse4");

        stableOne.add(horse);
        stableOne.add(horse2);
        stableOne.add(horse3);
        stableOne.add(horse4);

        horse.hasRider = true;
        horse2.hasRider = true;
        horse3.hasRider = true;
        horse4.hasRider = true;

        Assert.assertTrue(horse.ride());
        Assert.assertTrue(horse2.ride());
        Assert.assertTrue(horse3.ride());
        Assert.assertTrue(horse4.ride());
    }

    @Test
    public void horseIsAnEaterTest() {
        Horse horse = new Horse("horse1");
        EarCorn earCorn = new EarCorn();
        horse.eat(earCorn);

        Assert.assertTrue(horse.hasEaten);
    }

    @Test
    public void froilanIsAnEaterTest() {
        Farmer froilan = new Farmer();
        EarCorn earCorn = new EarCorn();
        Tomato tomato= new Tomato();
        Egg egg = new Egg();

        froilan.eat(earCorn);
        froilan.eat(tomato);
        froilan.eat(egg);

        Assert.assertTrue(froilan.hasEaten);
    }

    @Test
    public void froilandaIsAnEaterTest() {
        Pilot froilanda = new Pilot();
    Tomato tomato = new Tomato();
    Egg egg = new Egg();
    EarCorn earCorn = new EarCorn();

        froilanda.eat(earCorn);
        froilanda.eat(tomato);
        froilanda.eat(egg);
//is this a variable or method?
        Assert.assertTrue(froilanda.hasEaten);
    }

    @Test
    public void froilanIsABotanist() {
        Farmer froilan = new Farmer();
//        CropRow cropRow = new CropRow();
//        Crop cornStalk = new Crop();
//        froilan.plant(cornStalk, cropRow);
//
//        int expectedCropRowSize = 1;
//        int actualCropRowSize = cropRow.size();

        Assert.assertTrue(froilan instanceof Botanist);
    }

    @Test
    public void froilanPlantsTomatoTest() {
        Farmer froilan = new Farmer();
        TomatoPlant tomatoPlant = new TomatoPlant();
        froilan.plant(tomatoPlant);

        Assert.assertTrue(froilan.plant(tomatoPlant));

    }
//        for (int i = 0; i < 12; i++) {
//            froilan.plant(cropRow.add(tomato));
//        }
//
//        int expectedCropRowSize = 12;
//        int actualCropRowSize = cropRow.size();
//
//        Assert.assertEquals(expectedCropRowSize, actualCropRowSize);
//    }

    @Test
    public void froilanPlantsCornStalkTest() {
        Farmer froilan = new Farmer();
        CornStalk cornStalk = new CornStalk();
        froilan.plant(cornStalk);

        Assert.assertTrue(froilan.plant(cornStalk));

//        for (int i = 0; i < 12; i++) {
//            froilan.plant(cropRow.add(cornStalk));
//        }
//
//        int expectedCropRowSize = 12;
//        int actualCropRowSize = cropRow.size();
//
//        Assert.assertEquals(expectedCropRowSize, actualCropRowSize);
    }

    @Test
    public void froilanPlantsWheatTest() {
        Farmer froilan = new Farmer();
        Wheatplant wheatplant = new Wheatplant();
        froilan.plant(wheatplant);

        Assert.assertTrue(froilan.plant(wheatplant));
    }



}
