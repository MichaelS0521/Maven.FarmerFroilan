package collections;

import Abstract.Crop;
import Interface.Botanist;
import concreteclass.CornStalk;
import concreteclass.TomatoPlant;
import concreteclass.Wheat;
import org.junit.Assert;
import org.junit.Test;

public class TestCropRow {
    @Test
    public void cropRowContainsTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        CornStalk cornStalk = new CornStalk();
        CropRow<Crop> cropRow = new CropRow<>();
        cropRow.add(tomatoPlant);
        cropRow.add(cornStalk);


        Assert.assertTrue(cropRow.contains(tomatoPlant) && cropRow.contains(cornStalk));
    }

    @Test
    public void cropRowAddTomatoTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow<Crop> cropRowOne = new CropRow<>();
        CropRow<Crop> cropRowTwo = new CropRow<>();
        for (int i = 0; i < 12; i++) {
            cropRowOne.add(tomatoPlant);
            cropRowTwo.add(tomatoPlant);
        }

        int expectedRowOneSize = 12;
        int actualRowOneSize = cropRowOne.size();

        int expectedRowTwoSize = 12;
        int actualRowOTwoSize = cropRowOne.size();

        Assert.assertEquals(expectedRowOneSize, actualRowOneSize);
        Assert.assertEquals(expectedRowTwoSize, actualRowOTwoSize);
    }

    @Test
    public void cropRowAddCornStalkTest() {
        CornStalk cornStalk = new CornStalk();
        CropRow<Crop> cropRowThree = new CropRow<>();
        CropRow<Crop> cropRowFour = new CropRow<>();
        for (int i = 0; i < 21; i++) {
            cropRowThree.add(cornStalk);
            cropRowFour.add(cornStalk);
        }

        int expectedRowThreeSize = 21;
        int actualRowThreeSize = cropRowThree.size();

        int expectedRowFourSize = 21;
        int actualRowFourSize = cropRowFour.size();

        Assert.assertEquals(expectedRowThreeSize, actualRowThreeSize);
        Assert.assertEquals(expectedRowFourSize, actualRowFourSize);
    }

    @Test
    public void cropRowAddWheatTest() {
        Wheat wheat = new Wheat();
        CropRow<Crop> cropRowFive = new CropRow<>();
        for (int i = 0; i < 10; i++) {
            cropRowFive.add(wheat);
        }

        int expectedRowFiveSize = 10;
        int actualRowFiveSize = cropRowFive.size();

        Assert.assertEquals(expectedRowFiveSize, actualRowFiveSize);
    }

    @Test
    public void cropRowSizeTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        CornStalk cornStalk = new CornStalk();
        Wheat wheat = new Wheat();

        CropRow<Crop> cropRowOne = new CropRow<>();
        CropRow<Crop> cropRowTwo = new CropRow<>();
        CropRow<Crop> cropRowThree = new CropRow<>();
        CropRow<Crop> cropRowFour = new CropRow<>();
        CropRow<Crop> cropRowFive = new CropRow<>();

        for (int i = 0; i < 12; i++) {
            cropRowOne.add(tomatoPlant);
            cropRowTwo.add(tomatoPlant);
        }
        for (int i = 0; i < 21; i++) {
            cropRowThree.add(cornStalk);
            cropRowFour.add(cornStalk);
        }
        for (int i = 0; i < 10; i++) {
            cropRowFive.add(wheat);
        }

        int expectedRowOneSize = 12;
        int actualRowOneSize = cropRowOne.size();

        int expectedRowTwoSize = 12;
        int actualRowOTwoSize = cropRowOne.size();

        int expectedRowThreeSize = 21;
        int actualRowThreeSize = cropRowThree.size();

        int expectedRowFourSize = 21;
        int actualRowFourSize = cropRowFour.size();

        int expectedRowFiveSize = 10;
        int actualRowFiveSize = cropRowFive.size();

        Assert.assertEquals(expectedRowOneSize, actualRowOneSize);
        Assert.assertEquals(expectedRowTwoSize, actualRowOTwoSize);
        Assert.assertEquals(expectedRowThreeSize, actualRowThreeSize);
        Assert.assertEquals(expectedRowFourSize, actualRowFourSize);
        Assert.assertEquals(expectedRowFiveSize, actualRowFiveSize);
    }
}
