package introJavaProgramming.chapter15EventDrivenProgramming;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by esta on 26/12/15.
 */
public class OKHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {

        char[][] board = new char[15][15];

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                board[i][j] = '?';
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


}
