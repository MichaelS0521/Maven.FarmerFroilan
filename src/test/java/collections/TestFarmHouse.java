package collections;
import Abstract.Person;
import concreteclass.Farmer;
import org.junit.Assert;
import org.junit.Test;
import static collections.FarmHouse.farmHouse;
import concreteclass.Pilot;
import Abstract.Person;
import org.junit.Assert;
import org.junit.Test;
import Interface.Botanist;
import Interface.Edible;



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

            Assert.assertTrue(farmHouse.contains(pilot));
        }

        @Test
        public void fieldSizeTest() {
            Farmer farmer = new Farmer();
            Pilot pilot = new Pilot();
            FarmField farmField = new FarmField();
            farmField.add(farmer);
            farmField.add(pilot);

            int expectedSize = 1;
            int actualSize = farmHouse.size();

            Assert.assertEquals(expectedSize, actualSize);
        }

    }

