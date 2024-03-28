package collections;

import concreteclass.Chicken;

import java.util.ArrayList;
import java.util.List;

public abstract class Dwelling <T> {

    public List<T> getDwellers() {
        return dwellers;
    }

    List<T> dwellers = new ArrayList<T>();

    public void add(T Animal) {
        dwellers.add(Animal);
    }
    public boolean contains(T Animal) {
        return dwellers.contains(Animal);
    }
}
