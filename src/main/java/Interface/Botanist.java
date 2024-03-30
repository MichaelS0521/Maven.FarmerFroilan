package Interface;


import Abstract.Crop;

public interface Botanist {
    default boolean plant(Crop crop) {
        return true;
    }
}
