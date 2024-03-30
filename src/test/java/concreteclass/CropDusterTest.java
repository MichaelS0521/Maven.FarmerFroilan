package concreteclass;

import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {


    @Test
    public void fly(){
        CropDuster cropDuster = new CropDuster();


        Assert.assertTrue(cropDuster.fly());





    }


}
