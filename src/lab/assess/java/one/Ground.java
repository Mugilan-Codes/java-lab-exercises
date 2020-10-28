package lab.assess.java.one;

import java.awt.*;
import javax.swing.*;

class DrawFrame {
    DrawFrame() {
        Frame f = new Frame("Area");
        Button undo = new Button("Undo");
        undo.setBounds(30, 100, 80, 30);
        f.add(undo);

        Button clear = new Button("Clear");
        clear.setBounds(120, 100, 80, 30);
        f.add(clear);

        String colors[] = {"Red", "Blue", "Green", "Black", "Pink"};
        JComboBox cb = new JComboBox(colors);
        cb.setBounds(220, 100, 80, 30);
        f.add(cb);


        String shapes[] = {"Rectangle", "Square", "Circle", "Triangle"};
        JComboBox cb1 = new JComboBox(shapes);
        cb1.setBounds(320, 100, 80, 30);
        f.add(cb1);

        f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);

    }
}

public class Ground {
    public static void main(String[] args) {
        DrawFrame df = new DrawFrame();
    }
}

