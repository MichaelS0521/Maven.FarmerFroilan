package concreteclass;

import org.junit.Assert;
import org.junit.Test;

public class TestChicken {
    @Test
    public void testYieldNotFertilized() {
        Chicken chicken = new Chicken("pecan");
        chicken.setFertilized(false);
        Egg egg = chicken.yield();
        Assert.assertFalse("Egg should not be null when chicken is not fertilized", egg == null);
    }

    @Test
    public void testYieldFertilized() {
        Chicken chicken = new Chicken("pecan");
        chicken.setFertilized(true);
        Egg egg = chicken.yield();
        Assert.assertTrue("Yield should return null when chicken is fertilized", egg == null);
    }


    @Test
    public void testIsFertilized() {
        Chicken chicken = new Chicken("pecan");
        chicken.setFertilized(true);
        Assert.assertTrue("Chicken should be fertilized", chicken.isFertilized());
        chicken.setFertilized(false);
        Assert.assertFalse("Chicken should not be fertilized", chicken.isFertilized());
    }

    @Test
    public void eatTest(){
        Chicken chicken = new Chicken("Malo");
        Tomato tomato = new Tomato();
        chicken.eat(tomato);
        Assert.assertTrue(chicken.hasEaten);
    }
//d
}
