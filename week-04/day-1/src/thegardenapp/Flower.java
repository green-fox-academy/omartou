package thegardenapp;

public class Flower extends Plant {

    public Flower(int waterAmmount, String color) {
        super(waterAmmount, color);

    }

    @Override
    public void watering(int water) {
        if (waterAmmount < 5) {
            super.watering((water / 100) * 75);
        } else {
            System.out.println();
        }
    }

    @Override
    public String toString() {
        if (waterAmmount > 5) {
            return "The" + color + "Flower doesnt need water";
        } else {
            return "The" + color + "Flower need water";
        }
    }
}