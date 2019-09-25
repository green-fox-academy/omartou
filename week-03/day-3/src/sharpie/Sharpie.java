package sharpie;

import java.awt.*;

public class Sharpie {

    Color color;
    float width;
    float inkAmount;

    public Sharpie(Color color, float width) {
        inkAmount = 100.0f;
        this.color = color;
        this.width = width;
    }
    public void use () {
        inkAmount--;
    }
}
