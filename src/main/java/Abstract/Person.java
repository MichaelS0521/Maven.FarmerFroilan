package Abstract;

import Interface.Edible;
import collections.FarmHouse;
import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private List<FarmHouse> farmHouse;



    public void addFarmHouse(FarmHouse farmHouse){
        this.farmHouse.add(farmHouse);
    }

//    public List<FarmHouse> getFarmHouse() {
//
//        return farmHouse;
//    }
}

