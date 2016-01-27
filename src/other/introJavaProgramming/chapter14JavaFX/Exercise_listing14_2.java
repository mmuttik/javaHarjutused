package other.introJavaProgramming.chapter14JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by esta on 26/12/15.
 */
public class Exercise_listing14_2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Button("OK"), 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("Second stage");

        stage.setScene(new Scene(new Button("New stage"), 100, 100));
        stage.show();
    }

}
