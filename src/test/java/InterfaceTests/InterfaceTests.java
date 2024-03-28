package InterfaceTests;

import Interface.*;
import concreteclass.*;
import org.junit.Assert;
import org.junit.Test;

public class InterfaceTests {


    //1, Testing if the class is implementing from this interface. (AirCraft)
    @Test
    public void testInterfaces1(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Aircraft);
    }

    //2, Testing if the class is implementing from this interface.(Produce)

    @Test
    public void testInterfaces2(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Produce);
    }

    //3, Testing if the class is implementing from this interface.(Harvest)
    @Test
    public void testInterfaces3(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Harvest);
    }

    //4, Testing if the class is implementing from this interface.(Botanist)
    @Test
    public void testInterfaces4(){
        Farmer farmer = new Farmer();
        Assert.assertTrue(farmer instanceof Botanist);
    }

    //5, Te1sting if the class is implementing from this interface.(Rideable)
    @Test
    public void testInterfaces5 (){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Rideable);
    }

    //6, Testing if the class is implementing from this interface. (Edible Interface)
    @Test
    public void testInterfaces6(){
        Tomato tomato = new Tomato();
        Assert.assertTrue(tomato instanceof Edible);
    }

    //7, Testing if the class is implementing from this interface.(Edible Interface)
    @Test
    public void testInterfaces7(){
        Egg egg = new Egg();
        Assert.assertTrue(egg instanceof Edible);
    }

    //8, Testing if the class is implementing from this interface.(Edible Interface)
    @Test
    public void testInterfaces8(){
        EarCorn earCorn = new EarCorn();
        Assert.assertTrue(earCorn instanceof Edible);
    }


    @Test
    public void testInterfaces9(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Fertilize);
    }


    @Test
    public void testInterfaces10(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Fertilize);
    }



}
