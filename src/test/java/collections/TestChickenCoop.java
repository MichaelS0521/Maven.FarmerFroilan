package collections;


import concreteclass.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class TestChickenCoop {
    @Test
    public void addChickenToCoopTest() {
        Chicken perdue = new Chicken("pecan");
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(perdue);

        Assert.assertTrue(chickenCoop.contains(perdue));
    }

    @Test
    public void sizeOfeChickenCoopTest() {

        Chicken perdue = new Chicken();
        Chicken perdue2 = new Chicken();
        Chicken perdue3 = new Chicken();

        Chicken perdue = new Chicken("pecan");
        Chicken perdue2 = new Chicken("pecan");
        Chicken perdue3 = new Chicken("pecan");

        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(perdue);
        chickenCoop.add(perdue2);
        chickenCoop.add(perdue3);

        int expectedSize = 3;
        int actualSize = chickenCoop.size();

        Assert.assertEquals(expectedSize, actualSize);
    }
}
