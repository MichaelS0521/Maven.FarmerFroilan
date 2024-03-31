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

/* For every Monday */
// Froilanda is a pilot
// cropDuster fly()
// cropDuster to fertilize
// each cropRow is fertilized.


import Abstract.Crop;
import Interface.Botanist;
import Interface.Rideable;
import Interface.Rider;
import collections.CropRow;
import concreteclass.CropDuster;
import concreteclass.Pilot;
import concreteclass.TomatoPlant;
import collections.Stables;
import concreteclass.*;
import org.junit.Assert;
import org.junit.Test;

public class MondayTest {

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

        Assert.assertTrue(froilan instanceof Botanist);
    }

    @Test
    public void froilandaIsAPilot() {
        Pilot froilanda = new Pilot();

        Assert.assertTrue(froilanda instanceof Pilot);
    }

    @Test
    public void cropDusterCanFlyTest() {
        CropDuster cropDuster = new CropDuster();

        cropDuster.hasPilot();

        Assert.assertFalse(cropDuster.hasPilot());
    }

    @Test
    public void cropDusterCanFertilized() {
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow();

        if (!cropRow.hasBeenFertilized()) {
            cropDuster.fertilize(cropRow);
        }

        Assert.assertTrue(cropDuster.hasBeenFertilized());
    }

    @Test
    public void cropDusterFertilized() {
        CropDuster cropDuster = new CropDuster();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow<Crop> cropRowOne = new CropRow<>();
        boolean expectedCropRowsFertilized = false;

        for (int i = 0; i < 12; i++) {
            cropRowOne.add(tomatoPlant);
        }
        if (cropRowOne.hasBeenFertilized()) {
            cropDuster.fertilize(cropRowOne);
            expectedCropRowsFertilized = true;
        }

        Assert.assertTrue(expectedCropRowsFertilized);
    }

    @Test
    public void cropDusterFertilizedRowTwoTest() {
        CropDuster cropDuster = new CropDuster();
        CornStalk cornStalk = new CornStalk();
        CropRow<Crop> cropRowOne = new CropRow<>();
        boolean expectedCropRowsFertilized = false;

        for (int i = 0; i < 12; i++) {
            cropRowOne.add(cornStalk);
        }
        if (cropRowOne.hasBeenFertilized()) {
            cropDuster.fertilize(cropRowOne);
            expectedCropRowsFertilized = true;
        }

        Assert.assertTrue(expectedCropRowsFertilized);
    }

    @Test
    public void cropDusterFertilizedRowThreeTest() {
        CropDuster cropDuster = new CropDuster();
        Wheatplant wheatplant = new Wheatplant();
        CropRow<Crop> cropRowOne = new CropRow<>();
        boolean expectedCropRowsFertilized = false;

        for (int i = 0; i < 12; i++) {
            cropRowOne.add(wheatplant);
        }
        if (cropRowOne.hasBeenFertilized()) {
            cropDuster.fertilize(cropRowOne);
            expectedCropRowsFertilized = true;
        }

        Assert.assertTrue(expectedCropRowsFertilized);
    }






}







