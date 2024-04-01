package Abstract;

import Interface.Rideable;
import concreteclass.CropDuster;

import java.util.ArrayList;


public class FarmVehicle implements Rideable {

        static ArrayList<Object> farmVehicle = new ArrayList<>();
        public void add(Object vehicle){
            farmVehicle.add(vehicle);
        }
        public boolean contains (Object vehicle){
            return farmVehicle.contains(vehicle);
        }
        public int size() {
            return farmVehicle.size();
        }

    @Override
    public boolean ride() {
        return false;
    }

    public String makeNoise() {
            return "Noise";

    }
    public boolean hasRider() {
          return false;
    }

}

