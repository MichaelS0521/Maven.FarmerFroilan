package concreteclass;

import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void mountTest(){
        Pilot Foilanda = new Pilot();

        Assert.assertTrue(Foilanda.mount());
    }


    @Test
    public void dismountTest(){
        Pilot Foilanda = new Pilot();

        Assert.assertTrue(Foilanda.dismount());
    }







}
