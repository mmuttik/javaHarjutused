package other.introJavaProgramming.chapter15EventDrivenProgramming;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by esta on 26/12/15.
 */
public class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        System.out.println("cancel button clicked");
    }
}
