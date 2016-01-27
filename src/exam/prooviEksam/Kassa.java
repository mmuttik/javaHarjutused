package exam.prooviEksam;

import java.util.ArrayList;

/**
 * Created by X1 on 26.01.2016.
 */
public class Kassa {

    private ArrayList<String> tooted = new ArrayList<>();
    private String toode;
    private String kassaPidajaNimi;

    public Kassa(String kassapidaja) {
        kassaPidajaNimi = kassapidaja;
    }

    public ArrayList lisaToode(String toode) {
        tooted.add(toode);
        return tooted;
    }

    public void eemaldaToode(String toode) {
        if (tooted.contains(toode)) {
            tooted.remove(tooted.indexOf(toode));
        }
    }

    public String votaTooted() {
        String toodeteNimekiri = "";
        for (int i = 0; i < tooted.size(); i++) {
            toodeteNimekiri += tooted.get(i);
            toodeteNimekiri += "";
        }
        return toodeteNimekiri;
    }

    public int votaToodeteArv() {
        int toodeteArv = tooted.size();
        return toodeteArv;
    }

    public String votaKassapidajaNimi() {
        return kassaPidajaNimi;
    }

    public void kliendilPoleRaha() {
        System.out.println("Kliendil jäi rahakott koju, aga õnneks sõber aitas hädast välja ja ostis tema eest!");
    }
}
