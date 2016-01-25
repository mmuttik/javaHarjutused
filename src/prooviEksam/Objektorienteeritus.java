package prooviEksam;

/*
 * Siin failis kasutatakse objekti prooviEksam.Kassa, aga prooviEksam.Kassa klassi ei eksisteeri. Sinu ülesanne
 * on see luua. Pane tähele, et mitte ükski objekti muutuja ei tohi olla
 * kättesaadav objektist väljaspoolt.
 *
 * Käesolevat klassi ei tohi muuta - mitte ühtegi tähemärki! Arvad, et ei jää vahele? :)

*/


/*public class Objektorienteeritus {

    public static void main(String[] args) {

        String kassapidaja = "Laine";
        Kassa kassa = new Kassa(kassapidaja);

        kassa.lisaToode("Piim");
        kassa.lisaToode("Sai");
        kassa.lisaToode("Lillkapsas");
        kassa.lisaToode("Lamuu jäätis");
        kassa.lisaToode("Kanepiküpsis");
        kassa.eemaldaToode("Piim");
        kassa.eemaldaToode("Sai");
        kassa.lisaToode("Leib");

        System.out.println("Klient ostis järgmised tooted: " + kassa.votaTooted());
        System.out.println("Tooteid on kokku: " + kassa.votaToodeteArv());
        System.out.println("Kassapidaja nimi on " + kassa.votaKassapidajaNimi());

        kassa.kliendilPoleRaha(); // Mis nüüd saab?

        System.out.println("Klient ostis järgmised tooted: " + kassa.votaTooted());
        System.out.println("Tooteid on kokku: " + kassa.votaToodeteArv());
    }
}*/

/*
// Estakaad
public class prooviEksam.Kassa {

    private ArrayList<String> tooted = new ArrayList<>();
    private String toode;
    private String kassapidajaNimi;

    prooviEksam.Kassa(String kassapidaja) {
        kassapidajaNimi = kassapidaja;
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
            toodeteNimekiri += " ";
        }
        return toodeteNimekiri;
    }

    public int votaToodeteArv() {
        int toodeteArv = tooted.size();
        return toodeteArv;

    }

    public String votaKassapidajaNimi() {
        return kassapidajaNimi;
    }

    public void kliendilPoleRaha() {
        System.out.println("Kliendil pole raha");
    }

}
*/
