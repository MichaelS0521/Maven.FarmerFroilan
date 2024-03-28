package collections;

import Abstract.Crop;
import concreteclass.CornStalk;
import concreteclass.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TestCropRow {
    @Test
    public void addCropsToCropRowTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        CornStalk cornStalk = new CornStalk();
        CropRow<Crop> cropRow = new CropRow<>();
        cropRow.add(tomatoPlant);
        cropRow.add(cornStalk);


        Assert.assertTrue(cropRow.contains(tomatoPlant) && cropRow.contains(cornStalk));
    }

    @Test
    public void cropRowContainsTomatoTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow<Crop> cropRowTomato = new CropRow<>();
        cropRowTomato.add(tomatoPlant);


        Assert.assertTrue(cropRowTomato.contains(tomatoPlant));
    }

    @Test
    public void cropRowContainsCornStalkTest() {
        CornStalk cornStalk = new CornStalk();
        CropRow<Crop> cropRow = new CropRow<>();
        cropRow.add(cornStalk);

        Assert.assertTrue(cropRow.contains(cornStalk));
    }

    @Test
    public void cornRowSizeTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        CornStalk cornStalk = new CornStalk();
        CropRow<Crop> cropRow = new CropRow<>();
        cropRow.add(tomatoPlant);
        cropRow.add(tomatoPlant);
        cropRow.add(cornStalk);
        cropRow.add(cornStalk);

        int expectedSize = 4;
        int actualSize = cropRow.size();

        Assert.assertEquals(expectedSize, actualSize);
    }
}
