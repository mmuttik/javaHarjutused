package other.introJavaProgramming.chapter14JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by esta on 26/12/15.
 */
public class Exercise_listing_14_1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btOK = new Button("Ok");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
