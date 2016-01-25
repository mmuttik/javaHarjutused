package kontrolltööOld;

/**
 * Kirjuta funktsioon valiVahemik, mis võtab ühe int tüüpi argumendi ja tagastab:
 * Arvu 0, kui argument oli väiksem, kui 10
 * Arvu 1, kui argument oli vahemikus 10-35
 * Arvu 2, kui argument oli suurem, kui 35
 */
public class Vahemik {
    public static void main(String[] args) {
        System.out.println(valiVahemik(-10));
    }

    private static int valiVahemik(int n) {
        if (n < 10) {
            return 0;
        } else if (n >= 10 && n <= 35) {
            return 1;
        } else if (n > 35) {
            return 2;
        }
        return n;
    }
}
