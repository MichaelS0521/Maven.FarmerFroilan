package collections;

import concreteclass.Horse;
import concreteclass.HorseTest;



import org.junit.Assert;
import org.junit.Test;

public class TestStable {
    @Test
    public void addHorseToStableTest() {



        Horse bojack = new Horse("mimi");

        Stables stable = new Stables();
        stable.add(bojack);

        Assert.assertTrue(stable.contains(bojack));
    }



    @Test
    public void constructorTest() {
        Stables stable = new Stables();
        Assert.assertNotNull(stable);
    }

}
