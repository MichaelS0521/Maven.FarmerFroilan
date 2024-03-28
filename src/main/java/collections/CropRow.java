package collections;

import java.util.ArrayList;
import java.util.List;

public class CropRow<Crop> {
    List<Crop> crops = new ArrayList<Crop>();


    public void add(Crop crop) {
        crops.add(crop);
    }

    public boolean contains(Crop crop) {
        return crops.contains(crop);
    }

    public int size() {
        return crops.size();
    }
}
