package sharpie;

import java.awt.*;

public class Sharpie {

    Color color;
    float width;
    float inkAmount = 100.0f;

    public Sharpie(Color color, float width) {
        this.color = color;
        this.width =width;
    }
    public void use() {
        inkAmount--;
    }
}
