package prooviEksamOther;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista ellips, mille värvi saab kasutaja muuta.
 */
public class JavaFX_Ellips extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        ColorPicker pick = new ColorPicker();

        Ellipse ellips = new Ellipse(150,100);
        ellips.setFill(Color.YELLOW);
        StackPane s = new StackPane();
        s.getChildren().addAll(ellips, pick);
        Scene scene = new Scene(s, 800, 600);

        pick.setOnAction(event -> {
            ellips.setFill(pick.getValue());
        });

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
