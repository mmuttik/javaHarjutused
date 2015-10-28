package otherExercises;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by kasutaja on 14.10.2015.
 */
public class Nupud extends Applet {
    Button nupp1 = new Button("Vajuta mind 1");
    Button nupp2 = new Button("Vajuta mind 2");
    Button nupp3 = new Button("Vajuta mind 3");
    public void init(){
        setLayout(new GridLayout(2, 2)); //read, veerud
        add(nupp1);
        add(nupp2);
        add(nupp3);
    }

}
