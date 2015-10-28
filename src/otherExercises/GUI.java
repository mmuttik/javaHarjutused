package otherExercises;

import java.awt.*;

/**
 * Created by kasutaja on 13.10.2015.
 */
public class GUI {
    public static void main(String[] args) {
        Frame tahvel = new Frame("Minu tahvel");
        tahvel.setSize(400,300); //suurus
        tahvel.setVisible(true); //muudab n‰htavaks
        tahvel.setLocation(400,400); //m‰‰rab asukoha
        tahvel.setBackground(Color.BLUE); //muudab taustav‰rvi
    }
}

