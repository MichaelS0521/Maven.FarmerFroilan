package collections;

import Abstract.Person;

import java.util.ArrayList;

public class FarmHouse {

    static ArrayList<Object> farmHouse = new ArrayList<>();
    public static boolean contains(Person pilot) {
        return farmHouse.contains(pilot);
    }

    public static void add(Person farmer) {
        farmHouse.add(farmer);
    }

    public int size(){
        System.out.println(farmHouse.size());
        return farmHouse.size();
    }


}





