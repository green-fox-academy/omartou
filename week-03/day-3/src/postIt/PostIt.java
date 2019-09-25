package postIt;

import java.awt.*;

public class PostIt {

    Color backgroundColor;
    String text;
    Color textColor;

    public PostIt(Color backgroundColor, String text, Color textColor) {

        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }
    public void printIt() {
        System.out.println(text);
        System.out.println(backgroundColor);
        System.out.println(textColor);
    }
}
