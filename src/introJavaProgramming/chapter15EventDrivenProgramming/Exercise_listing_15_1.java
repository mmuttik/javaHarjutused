package introJavaProgramming.chapter15EventDrivenProgramming;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by esta on 26/12/15.
 */
public class Exercise_listing_15_1 extends Application{
    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("prindi laud");
        Button btCancel = new Button("cancel");
        OKHandlerClass handler1 = new OKHandlerClass();
        btOK.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        pane.getChildren().addAll(btOK, btCancel);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("handleevent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
