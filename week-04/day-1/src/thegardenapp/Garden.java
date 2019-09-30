package thegardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> plants = new ArrayList<>();

    public Garden() {

    }
    public void addPlants (Plant plant) {
        plants.add(plant);
    }

}
