package collections;

import Abstract.Crop;
import concreteclass.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TestCropRow {
    @Test
    public void addCropToCropRowTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow<Crop> cropRow = new CropRow<>();
        cropRow.add(tomatoPlant);

        Assert.assertTrue(cropRow.contains(tomatoPlant));
    }
}
