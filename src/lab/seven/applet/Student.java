package lab.seven.applet;

import java.applet.Applet;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

//<applet code="Student.class" width=1000 height=1000>

public class Student extends Applet {
    public void init() {
        setBackground(Color.black);
        setForeground(Color.green);
    }

    public void paint(Graphics g) {
        Font font = new Font("Algerian", 0, 25);
        g.setFont(font);

        g.drawString("Student Details", 120, 120);
        g.drawString("Roll No.: 2019202033", 150, 150);
        g.drawString("Name: Mugilan E.S.", 150, 180);
        g.drawString("Semester: 3rd", 150, 210);
        g.drawString("Department: IST", 150, 240);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E MM/dd/yyyy k:m:s z");
        g.drawString(simpleDateFormat.format(new Date()), 120, 270);
    }
}
