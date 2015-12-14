package KT;

/**
 * Created by X1 on 8.12.2015.
 */
public class Asenda_ilmatsyklita {
    public static void main(String[] args) {
        System.out.println(asenda("ainultneedongi"));
    }

    private static String asenda(String s) {
        return s.replaceAll("[a-z]", "-");
    }
}
