package collections;

import java.util.ArrayList;

public class FarmField {

    ArrayList<Object> farmField = new ArrayList<>();


    public void add(Object cropRow) {
        farmField.add(cropRow);
    }

    public boolean contains(Object cropRow) {
        return farmField.contains(cropRow);
    }

    public int size() {
        return farmField.size();
    }
}
