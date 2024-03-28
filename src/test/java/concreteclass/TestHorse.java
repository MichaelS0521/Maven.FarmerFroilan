package concreteclass;

import org.junit.Assert;
import org.junit.Test;


public class TestHorse {
    @Test
    public void testRideReturnsFalse() {
        Horse horse = new Horse("mimi");
        boolean canRide = horse.ride();
        Assert.assertFalse(canRide);
    }
}