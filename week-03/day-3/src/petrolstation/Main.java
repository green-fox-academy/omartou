package petrolstation;

public class Main {

    public static void main(String[] args) {

        Car firstCar = new Car();
        Car secondCar = new Car(12,90);
        Station firstStation = new Station(200);

        firstStation.refill(secondCar);
        System.out.println(secondCar.capacity);
        System.out.println(secondCar.gasAmount);
        System.out.println(firstStation.gasAmount);
    }
}
