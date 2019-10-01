package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar(int numberOfString) {
        super.name = "Electric Guitar";
        super.numberOfString = numberOfString;
    }

    @Override
    public String sound() {
        return "Twang";
    }
}
