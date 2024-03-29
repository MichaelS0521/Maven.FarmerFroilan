package collections;
import Abstract.Person;
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
            Person farmer = new Person() {
                @Override
                public void addFarmHouse(FarmHouse farmHouse) {

                }
            };
            FarmHouse.add(farmer);

            Assert.assertTrue(FarmHouse.contains(farmer));
        }

        @Test
        public void addPilotToFarmHouseTest(){
            Person pilot = new Person() {
                @Override
                public void addFarmHouse(FarmHouse farmHouse) {

                }
            };
            FarmHouse farmHouse = new FarmHouse();
            FarmHouse.add(pilot);

            Assert.assertTrue(FarmHouse.contains(pilot));
        }

        @Test
        public void fieldSizeTest() {
            Person farmer = new Person() {
                @Override
                public void addFarmHouse(FarmHouse farmHouse) {

                }
            };
            Person pilot = new Person() {
                @Override
                public void addFarmHouse(FarmHouse farmHouse) {

                }
            };
            FarmField farmField = new FarmField();
            farmField.add(farmer);
            farmField.add(pilot);

            int expectedSize = 1;
            int actualSize = farmHouse.size();

            Assert.assertEquals(expectedSize, actualSize);
        }

    }

