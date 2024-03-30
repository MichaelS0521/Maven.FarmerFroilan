
package concreteclass;
import Abstract.Person;
import Interface.Botanist;
import Interface.Edible;
import Interface.Rider;
import collections.FarmHouse;



public class Farmer extends Person implements Botanist, Rider {


    public boolean hasEaten = false;

    @Override
    public boolean mount() {
return true;
    }

    @Override
    public boolean dismount() {
return true;

    }

    @Override
    public void addFarmHouse(FarmHouse farmHouse) {

    }

    public void eat(Edible edible) {
        hasEaten = true;
    }
}

