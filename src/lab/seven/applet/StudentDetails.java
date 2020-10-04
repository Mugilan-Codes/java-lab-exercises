package lab.seven.applet;

import java.applet.Applet;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentDetails extends Applet {

    @Override
    public void init() {
        super.init();
        setBackground(Color.orange);
        setForeground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("Roll No.: 2019202033", 25, 25);
        g.drawString("Name: Mugilan E.S.", 25, 50);
        g.drawString("Semester: III", 25, 75);
        g.drawString("Department: IST", 25, 100);

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy " +
                "HH:mm:ss");
        Date date = new Date();
        g.drawString(dateFormat.format(date), 25, 125);
    }
}
