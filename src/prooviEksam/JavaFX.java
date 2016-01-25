package prooviEksam;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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

      /*  // Estakaadi lahendus
        VBox kastid = new VBox();
        Scene scene = new Scene(kastid, 150, 150);
        primaryStage.setScene(scene);

        Label silt = new Label("mingi");
        TextField kirjuta = new TextField();

        kirjuta.setOnAction(event -> {
            String b = kirjuta.getText();
            System.out.println(b);
            silt.setText(b);
        });

        kastid.getChildren().addAll(silt, kirjuta);

        primaryStage.show();*/

    }
}
