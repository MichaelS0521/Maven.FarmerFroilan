package collections;


import concreteclass.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class TestChickenCoop {
    @Test
    public void addChickenToCoopTest() {
        Chicken perdue = new Chicken();
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(perdue);

        Assert.assertTrue(chickenCoop.contains(perdue));
    }
}
