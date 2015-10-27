package MyVarious;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;

/**
 * Created by kasutaja on 14.10.2015.
 */
public class ObjektideLiigutamine extends Applet {
    //manipuleerimine_kujunditega
    public void paint(Graphics g) {
        int[] x = new int[]{0, 10, 5, 5, -5, -5, -10};
        int[] y = new int[]{-15, 5, 5, 15, 15, 5, 5};

        Graphics2D g2=(Graphics2D)g;
        AffineTransform liiguta_kujundit = new AffineTransform();
        liiguta_kujundit.setToTranslation(20, 20);
        liiguta_kujundit.rotate(Math.PI/4);
        g2.setTransform(liiguta_kujundit);
        g2.drawPolygon(x,y,7);
    }

    //kuvab raamakna
    public static void main(String args[]) {
        Frame raam = new Frame();
        raam.setSize(400, 400);
        raam.show();
        //kuvame Appleti siin raamis
        Applet minu_rakend = new ObjektideLiigutamine();
        raam.add(minu_rakend);

        //kuular, mis võimaldab akna ristist sulgeda
        raam.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

