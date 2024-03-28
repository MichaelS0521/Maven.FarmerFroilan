package collections;

import org.junit.Assert;
import org.junit.Test;


public class TestField {

    @Test
    public void addCropRowToFieldTest() {
        Object cropRow = new Object();
        FarmField farmField = new FarmField();
        farmField.add(cropRow);

        Assert.assertTrue(farmField.contains(cropRow));
    }

    @Test
    public void fieldContainsCropRowTest() {
        Object cropRow = new Object();
        FarmField farmField = new FarmField();
        farmField.add(cropRow);

        Assert.assertTrue(farmField.contains(cropRow));
    }

    @Test
    public void fieldSizeTest() {
        Object cropRow = new Object();
        Object cropRow2 = new Object();
        FarmField farmField = new FarmField();
        farmField.add(cropRow);
        farmField.add(cropRow2);

        int expectedSize = 2;
        int actualSize = farmField.size();

        Assert.assertEquals(expectedSize, actualSize);
    }


}
