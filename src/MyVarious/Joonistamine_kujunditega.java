package MyVarious;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by kasutaja on 14.10.2015.
 */
public class Joonistamine_kujunditega extends Applet {

    //Kujundite joonistamine
    public void paint(Graphics g) {
        g.drawRect(50, 50, 150, 150);
    }

    //kuvab raamakna
    public static void main(String args[]) {
        Frame raam = new Frame();
        raam.setSize(300, 300);
        raam.show();
        Applet minu_rakend = new Joonistamine_kujunditega();
        raam.add(minu_rakend);
        raam.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

