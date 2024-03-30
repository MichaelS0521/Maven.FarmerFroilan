package concreteclass;
import Abstract.Person;
import Interface.Aircraft;
import Interface.Edible;
import Interface.Fertilize;
import Interface.Rider;
import collections.FarmHouse;


public class Pilot extends Person implements Rider, Aircraft{
    public boolean hasEaten = false;

    @Override
    public boolean fly() {
        return false;
    }


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
