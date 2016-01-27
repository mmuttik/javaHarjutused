package kt_d.kontrolltööOld;

/**
 * Created by X1 on 6.12.2015.
 */
public class Asenda_tsykliga {

    public static void main(String[] args) {
        String s = "Tere, 1234 ja 5678";
        String t = asenda(s); // "Tere, #### ja ####"
        System.out.println(s + " --> " + t);
    }

    public static String asenda(String s) {
        String asenda = "";
        for (int i = 0; i < s.length(); i++) {
            asenda = s.replaceAll("[0-9]", "#");
        }
        return asenda;
    }
}

