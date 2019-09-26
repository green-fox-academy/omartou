package sharpie;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Sharpie blueSharpie = new Sharpie(Color.BLUE, 23.2f);

        blueSharpie.use();
        System.out.println(blueSharpie.inkAmount);
    }
}