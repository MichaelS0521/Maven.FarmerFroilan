package concreteclass;
import Abstract.Person;
import Interface.Aircraft;
import Interface.Fertilize;


public class Pilot implements Aircraft, Fertilize {
    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }
}
