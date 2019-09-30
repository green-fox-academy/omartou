package thegardenapp;

public class Main {

    public static void main(String[] args) {

        Flower yellowFlower = new Flower(20, "yellow");
        Flower blueFlower = new Flower(4, "blue");
        Tree purpleTree = new Tree(6, "purple");
        Tree orangeTree = new Tree(1, "orange");

        Garden mainGarden = new Garden();

        mainGarden.addPlants(yellowFlower);
        mainGarden.addPlants(blueFlower);
        mainGarden.addPlants(purpleTree);
        mainGarden.addPlants(orangeTree);

        for (Plant plant : mainGarden.plants) {
            plant.watering(100);
        }
    }
}
