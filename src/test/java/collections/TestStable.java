package collections;

import com.beust.ah.A;
import concreteclass.Horse;
import concreteclass.HorseTest;



import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestStable {
    @Test
    public void addHorseToStableTest() {



        Horse bojack = new Horse("mimi");

        Stables stable = new Stables();
        stable.add(bojack);

        Assert.assertTrue(stable.contains(bojack));
    }


    @Test
    public void horseInstanceReturn() {
        Stables stable = new Stables();
        Horse horse = new Horse("donald");
        stable.add(horse);

        Horse returnedHorse = stable.get(0);

        Assert.assertTrue(returnedHorse != null);
    }
    @Test
    public void hourseAtIndexTest() {
        Stables stable = new Stables();
        Horse expected = new Horse("Benny");
        stable.add(expected);

        Horse actual = stable.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void horseCountAddingTest() {
        Stables stable = new Stables();
        stable.add(new Horse("Pickle"));
        stable.add(new Horse("Mustard"));

        int expected = 2;
        int actual = stable.getDwellers().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void horseListTest() {
        Stables stable = new Stables();
        Horse bishop = new Horse("bishop");
        Horse sankey = new Horse("sankey");
        stable.add(bishop);
        stable.add(sankey);

        List<Horse> horses = stable.getDwellers();

        Assert.assertTrue(horses.contains(sankey));
    }




    @Test
    public void constructorTest() {
        Stables stable = new Stables();
        Assert.assertNotNull(stable);

    }

}
