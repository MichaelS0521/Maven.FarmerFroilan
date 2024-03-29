package collections;

import concreteclass.HorseTest;



import org.junit.Assert;
import org.junit.Test;

public class TestStable {
    @Test
    public void addHorseToStableTest() {
        HorseTest bojack = new HorseTest();
        Stables stable = new Stables();
        stable.add(bojack);

        Assert.assertTrue(stable.contains(bojack));
    }



    @Test
    public void constructorTest() {
        Stable stable = new Stable();
        Assert.assertNotNull(stable);
    }

}
