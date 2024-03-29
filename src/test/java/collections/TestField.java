package collections;

import org.junit.Assert;
import org.junit.Test;


public class TestField {

    @Test
    public void addCropRowToFieldTest() {
        Object cropRow = new Object();
        FarmField farmField = new FarmField();
        farmField.add(cropRow);

        int expectedNumOfCropRows = 1;
        int actualNumOfCropRows = farmField.size();

        Assert.assertEquals(expectedNumOfCropRows, actualNumOfCropRows);
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
        Object cropRow1 = new Object();Object cropRow2 = new Object();Object cropRow3 = new Object();
        Object cropRow4 = new Object();Object cropRow5 = new Object();
        FarmField farmField = new FarmField();
        farmField.add(cropRow1);farmField.add(cropRow2);farmField.add(cropRow3);
        farmField.add(cropRow4);farmField.add(cropRow5);

        int expectedSize = 5;
        int actualSize = farmField.size();

        Assert.assertEquals(expectedSize, actualSize);
    }


}
