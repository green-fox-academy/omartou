package thegardenapp;

import java.util.ArrayList;
import java.util.List;

public class Plant {

    int waterAmmount;
    String color;

    public Plant(int waterAmmount, String color) {
        this.waterAmmount = waterAmmount;
        this.color = color;
    }

    public void watering(int water){
        waterAmmount += water;
    }
}
