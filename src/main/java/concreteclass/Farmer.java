
package concreteclass;
import Abstract.Person;
import Interface.Botanist;
import Interface.Edible;
import Interface.Rider;
import collections.FarmHouse;



public class Farmer extends Person implements Botanist, Rider {


    public boolean hasEaten = false;

    @Override
    public void mount() {

    }

    @Override
    public void dismount() {


    }

    @Override
    public void addFarmHouse(FarmHouse farmHouse) {

    }

    public void eat(Edible edible) {
        hasEaten = true;
    }
}

