package thegardenapp;

public class Tree extends Plant {

    public Tree(int waterAmmount, String color) {
        super(waterAmmount, color);

    }

    @Override
    public void watering(int water) {
        if (waterAmmount < 10) {
            super.watering((water / 100) * 40);
        }
    }

    @Override
    public String toString() {
        if (waterAmmount > 10) {
            return "The" + color + "Tree doesnt need water";
        } else {
            return "The" + color + "Tree need water";
        }
    }
}