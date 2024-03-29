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
import collections.CropRow;
import concreteclass.CropDuster;
import concreteclass.Pilot;
import concreteclass.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class MondayTest {

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






}







