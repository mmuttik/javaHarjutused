package kontrolltööNew;

/**
 * Created by X1 on 8.01.2016.
 */
public class Replace_All_Tsykliga {
    public static void main(String[] args) {
        System.out.println(asenda("Asenda koik tahed margiga #"));
    }

    private static String asenda(String s) {
        String vastus = "";
        for (int i = 0; i < s.length(); i++) {
            vastus = s.replaceAll("[A-z]", "#");
        }
        return vastus;
    }
}
