package concreteclass;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {




    @Test
    public void horseTest() {
        Horse horse = new Horse("Horse");
        Assert.assertNotNull(horse);
    }

    //WHat is this!!!
//    @Test
//    public void rideTest(){
//        Horse horse = new Horse("Horse");
//
//        horse.ride();
//
//        Assert.assertTrue(horse.hasRider);
//    }

    //git
    @Test
    public void eatTest(){
        Horse horse = new Horse("Horse");
        horse.eat();
        Assert.assertTrue(horse.hasEaten);
    }




}