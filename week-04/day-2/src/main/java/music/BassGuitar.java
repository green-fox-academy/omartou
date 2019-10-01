package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar(String name) {
        super.name = name;
        super.numberOfString = 4;
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
