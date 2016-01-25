package kontrolltööOld;

/**
 * Created by X1 on 9.12.2015.
 */
public class Asenda_mittet2hed_StringBuffer {
    public static void main(String[] args) {
        System.out.println(asenda("123456YEAH_YOU_GOT_IT-.,´+1"));
    }

    private static String asenda(String s) {

        StringBuffer vastus = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                vastus.append(c);
            } else {
                vastus.append(".");
            }
        }
        return vastus.toString();
    }
}
