package collections;

import concreteclass.Horse;



import org.junit.Assert;
import org.junit.Test;

public class TestStable {
    @Test
    public void addHorseToStableTest() {
        Horse bojack = new Horse();
        Stables stable = new Stables();
        stable.add(bojack);

        Assert.assertTrue(stable.contains(bojack));
    }
}
