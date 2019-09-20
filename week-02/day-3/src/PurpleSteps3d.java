import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

/*
        for (int i = 0; i < 6; i++) {
           // for (int j = 0; j < 6; j++) {

                graphics.setColor(Color.GREEN);
                graphics.fill3DRect((i + 1) * 20, (i + 1) * 20, 20 * (i + i), 20 * (i + i), true);

            }

           /*
            for (int i = 0; i < 10; i++) {

            graphics.setColor(Color.PINK);
            graphics.fillRect(20 * i, 20 * i, 20, 20);
            */


        }


        // Don't touch the code below
        static int WIDTH = 500;
        static int HEIGHT = 500;

        public static void main (String[]args){
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