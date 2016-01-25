package kontrolltööNew;


/**
 * Created by X1 on 8.01.2016.
 */

public class StringBuffer_IfStatement {
    public static void main(String[] args) {
        System.out.println(asenda("Asenda koik mittetahed margiga #: TEST123"));
    }

    private static String asenda(String s) {
        StringBuffer vastus = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isLetter(temp)) {
                vastus.append(temp);
            } else {
                vastus.append("#");
            }

        } return vastus.toString();
    }
}
