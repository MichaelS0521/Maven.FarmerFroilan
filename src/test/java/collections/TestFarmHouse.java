package collections;
import Abstract.Person;
import concreteclass.Farmer;
import org.junit.Assert;
import org.junit.Test;
import static collections.FarmHouse.farmHouse;
import concreteclass.Pilot;



    public class TestFarmHouse {
        @Test
        public void addFarmerToFarmHouseTest(){
            Farmer farmer = new Farmer();
            FarmHouse.add(farmer);

            Assert.assertTrue(FarmHouse.contains(farmer));
        }

        @Test
        public void addPilotToFarmHouseTest(){
            Pilot pilot = new Pilot();
            FarmHouse farmHouse = new FarmHouse();
            farmHouse.add(pilot);

            Assert.assertTrue(FarmHouse.contains(pilot));
        }

        @Test
        public void fieldSizeTest() {
            Farmer farmer = new Farmer();
            Pilot pilot = new Pilot();
            FarmHouse farmHouse = new FarmHouse();
            farmHouse.add(farmer);
            farmHouse.add(pilot);

            int expectedSize = 3;
            int actualSize = farmHouse.size();

            Assert.assertEquals(expectedSize, actualSize);
        }

    }

