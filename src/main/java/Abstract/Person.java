package Abstract;
import collections.FarmHouse;
import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private List<FarmHouse> farmHouse;

    public Person(String name, List<FarmHouse> farmHouse) {

        this.farmHouse = farmHouse;
    }

    public Person(List<FarmHouse> farmHouse) {

        this.farmHouse = farmHouse;
    }

    public Person() {
//Yeah
    }

    public abstract void addFarmHouse(FarmHouse farmHouse);

    public List<FarmHouse> getFarmHouse() {

        return farmHouse;
    }
}

