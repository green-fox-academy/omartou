import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        for (int i = 0; i < 500; i += 20) {
            drawSingleLine(graphics, i, 0);
        }
        for (int j = 0; j < 500; j += 20) {
            drawSingleLine(graphics, 0, j);
        }
        for (int k = 0; k < 500; k += 20) {
            drawSingleLine(graphics, k, 500);
        }
        for (int l = 0; l < 500; l += 20) {
            drawSingleLine(graphics,500, l);

        }
        drawSingleLine(graphics, 500, 500);
    }

    public static void drawSingleLine(Graphics graphics, int x, int y) {
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}