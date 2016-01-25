package prooviEksamOtherVer;

import java.util.ArrayList;

/**
 * Created by janikaa on 24.01.2016.
 */
public class Seljakott {

    private String omanikuNimi = "Kihnu Virve";
    private ArrayList tarbed = new ArrayList(); //tarvete nimekiri
    private String kotiOmanik;

    public Seljakott(String omanikuNimi) {

        return;
    }


    //Seljakott kott = new Seljakott(omanikuNimi);


    //Nimekiri asjadest, mida lisatakse seljakotti:
    public ArrayList lisaAsi(String varustus) {
        tarbed.add(varustus);
        return tarbed;
    }

    //Meetod, mis eemaldab seljakotist asju:
    public void eemaldaAsi(String varustus) {
        if (tarbed.contains(varustus)) {
            tarbed.remove(tarbed.indexOf(varustus));
        }
    }

    //Ts�kkel, mis �tleb, mis asjad kotis on:
    public String misOnKotis() {
        String asjad = "";
        for (int i = 0; i < tarbed.size(); i++) {
            asjad += tarbed.get(i);
            asjad += "";
        }
        return asjad;
    }

    public int mituAsjaOnKotis() {
        int asjadeArv = tarbed.size();
        return asjadeArv;
    }

    public void rebene() {
        System.out.println("Kott rebenes!");
        tarbed.clear();

    }

    public String omanikuNimi() {
        return omanikuNimi;
    }


}

