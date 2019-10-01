package main.java.music;

public class Violin extends StringedInstrument {

    public Violin(String name) {
        super.name = name;
        super.numberOfString = 4;
    }

    @Override
    public String sound() {
        return "Screech";
    }
}
