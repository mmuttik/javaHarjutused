package kontrolltööNew;

/**
 * Created by X1 on 8.01.2016.
 */
public class IfStatemendiga_Tsykliga {
    public static void main(String[] args) {
        System.out.println(asenda("Asenda koik tahed margiga #"));
    }

    private static String asenda(String s) {
        String vastus = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                vastus += "#";
            } else {
                vastus += s.charAt(i); // Jätab muutmata
            }
        }
        return vastus;
    }
}

// Numbrite asendamiseks Character.isDigit; Suurtähtede asendamiseks isUpperCase; Peale Character.is kirjutamist näeb ka muid asendamisvariante
