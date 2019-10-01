package main.java.music;

public class AppMusic {

    public static void main(String[] args) {

        System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
        ElectricGuitar guitar = new ElectricGuitar(6);
        BassGuitar bassGuitar = new BassGuitar("Bass Guitar");
        Violin violin = new Violin("Violin");

        System.out.println("Test 1 Play");
        guitar.play();
        bassGuitar.play();
        violin.play();

        System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
        ElectricGuitar guitar2 = new ElectricGuitar(6);
        BassGuitar bassGuitar2 = new BassGuitar("BassGuitar");

        System.out.println("Test 2 Play");
        guitar2.play();
        bassGuitar2.play();
    }
}
