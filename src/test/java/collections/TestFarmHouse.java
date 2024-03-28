package collections;
import concreteclass.Pilot;
import Abstract.Person;
//import concreteclass.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class TestFarmHouse {
    @Test
    public void addFarmerToFarmHouseTest(){
    Person farmer = new Person();
    FarmHouse farmHouse = new FarmHouse();
        FarmHouse.add(farmer);

        Assert.assertTrue(FarmHouse.contains(farmer));
    }

    @Test
    public void addPilotToFarmHouseTest(){
        Person pilot = new Person();
        FarmHouse farmHouse = new FarmHouse();
        FarmHouse.add(pilot);

        Assert.assertTrue(FarmHouse.contains(pilot));
    }
}

