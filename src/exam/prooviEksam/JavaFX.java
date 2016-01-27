package exam.prooviEksam;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Loo Label, mille sisu saab kasutaja TextFieldi kaudu muuta.
 */
public class JavaFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(30));
        hbox.setSpacing(30);
        Scene scene = new Scene(hbox);

        Label label = new Label("Muuda mind");
        TextField muuda = new TextField("Kirjuta siia, et muuta");
        muuda.setOnAction(event -> {
            label.setText(muuda.getText());
        });


        hbox.getChildren().addAll(label, muuda);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
