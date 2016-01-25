package prooviEksamKrister;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by X1 on 21.01.2016.
 */
public class MuudaLabel extends Application {

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

       /* //Klikiga, vers 1.0

        Label label = new Label("Muuda mind");
        Button btn = new Button("Muuda teksti");
        btn.setOnMouseClicked(event -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Sisesta uus tekst:");
            String text = sc.nextLine();
            label.setText(text);
        });

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(30));
        hbox.setSpacing(30);
        hbox.getChildren().addAll(label, btn);

        Scene scene = new Scene(hbox, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();*/
    }
}
