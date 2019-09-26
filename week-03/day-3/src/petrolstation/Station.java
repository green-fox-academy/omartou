package petrolstation;

public class Station {

    int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }
    public void refill(Car myCar) {
        while ((myCar.gasAmount < myCar.capacity) && (gasAmount > 0)) {
            gasAmount--;
            myCar.gasAmount++;
        }
    }
    /*
    public void adder(int a){
        System.out.println(a);
     */
}
