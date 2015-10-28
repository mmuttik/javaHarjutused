package otherExercises;

import java.net.Socket;

/**
 * Created by kasutaja on 14.10.2015.
 */
public class Server {
    public static void main(String[] argv) {

        String server_name = "www.metshein.com";

        try {
            Socket sock = new Socket(server_name, 80);
            System.out.println(" *** Ühendus loodud: " + server_name + " ***");
            sock.close();
        } catch (java.io.IOException e) {
            System.err.println("Ei saa ühendust serveriga " + server_name + ": " + e);
            return;
        }
    }
}
