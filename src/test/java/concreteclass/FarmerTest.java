package concreteclass;

import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {


    @Test
    public void mountTest(){
        Farmer Foilanda = new Farmer();

        Assert.assertTrue(Foilanda.mount());
    }


    @Test
    public void dismountTest(){
        Farmer Foilanda = new Farmer();

        Assert.assertTrue(Foilanda.dismount());
    }


    @Test
    public void froilanIsAnEaterTest() {
        Farmer froilan = new Farmer();
        EarCorn earCorn = new EarCorn();
        Tomato tomato= new Tomato();
        Egg egg = new Egg();

        froilan.eat(earCorn);
        froilan.eat(tomato);
        froilan.eat(egg);

        Assert.assertTrue(froilan.hasEaten);
    }


}
