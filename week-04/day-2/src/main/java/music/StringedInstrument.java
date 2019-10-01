package main.java.music;

public abstract class StringedInstrument extends Instrument {

    int numberOfString;

    public StringedInstrument() {
    }

    public StringedInstrument(String name) {
        super(name);
    }

    public abstract String sound();

    public void play() {
        System.out.println(name + ", a " + numberOfString + "-stringed instrument that goes" + sound());

    }
}
