package kt_d.kontrolltööOld;

/**
 * Created by X1 on 9.12.2015.
 */
public class Asenda_k8ikt2hed_Xga {
    public static void main(String[] args) {
        System.out.println(asenda("kjdsaljdsj"));
    }

    private static String asenda(String s) {

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                temp += "x";
            } else {
                temp += s.charAt(i);
            }
        }
        return temp;
    }
}
