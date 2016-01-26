package introJavaProgramming.chapter14JavaFX;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by esta on 26/12/15.
 */
public class Exercise_listing_14_10_3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("Eesnimi"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("Perekonnanimi"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Aadress"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btAdd = new Button("add name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("showgridpane");
        primaryStage.setScene(scene);
        primaryStage.show();
}

}
