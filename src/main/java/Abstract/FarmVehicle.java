package Abstract;

import java.util.ArrayList;

public class FarmVehicle   {
    public boolean hasRider = false;
        ArrayList<Object> farmVehicle = new ArrayList<>();

        public void add(Object vehicle){
            farmVehicle.add(vehicle);
        }
        public boolean contains (Object vehicle){
            return farmVehicle.contains(vehicle);
        }

    public void ride() {
    }

    public String makeNoise() {
            return "Noise";
    }


}

