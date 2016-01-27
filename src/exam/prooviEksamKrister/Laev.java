package exam.prooviEksamKrister;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by X1 on 25.01.2016.
 */
public class Laev {

    private String name;
    private ArrayList<String> passengers = new ArrayList<>();
    private Random randomGenerator;

    public Laev(String shipName) {
        this.name = shipName;
        randomGenerator = new Random();
    }

    public String misNimi() {
        return this.name;
    }

    public void lisaReisija(String passengerName) {
        this.passengers.add(passengerName);
    }

    public void eemaldaReisija(String passengerName) {
        this.passengers.remove(passengerName);
    }

    public String votaReisijad() {
        return this.passengers.toString();
    }

    public int reisijateArv() {
        return this.passengers.size();
    }

    public void kalaHammustasKummipaatiAugu() {
        int deadPassengerIndex = randomGenerator.nextInt(this.passengers.size());
        this.passengers.remove(deadPassengerIndex);
    }
}
