package concreteclass;

import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {



    @Test
    public void eatTest(){
        Farmer farmer = new Farmer();
        farmer.eat();
        Assert.assertTrue(farmer.hasEaten);
    }






}
