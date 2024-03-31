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


    public void eat(Edible edible) {
        hasEaten = true;
    }

    @Override
    public boolean mount() {
        return true;

    }

    @Override
    public boolean dismount() {
return true;
    }


}
