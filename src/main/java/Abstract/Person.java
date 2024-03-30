package Abstract;

import Interface.Edible;
import collections.FarmHouse;
import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private List<FarmHouse> farmHouse;


    public abstract void mount();

    public abstract void dismount();

    public abstract void addFarmHouse(FarmHouse farmHouse);

    public List<FarmHouse> getFarmHouse() {

        return farmHouse;
    }
}

