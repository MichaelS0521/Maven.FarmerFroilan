package Abstract;

import Interface.Eater;
import Interface.Noisemaker;

public abstract class Animal implements Eater, Noisemaker {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
}
