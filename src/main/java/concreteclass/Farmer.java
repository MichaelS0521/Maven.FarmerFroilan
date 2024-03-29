package concreteclass;

import Abstract.Person;
import Interface.Botanist;

public class Farmer extends Person implements Botanist {

    @Override
    public boolean plant() {
        return false;
    }

    @Override
    public void eat() {

    }

    @Override
    public void mount() {

    }

    @Override
    public void dismount() {

    }
}
