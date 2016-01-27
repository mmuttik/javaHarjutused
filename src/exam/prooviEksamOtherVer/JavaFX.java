package exam.prooviEksamOtherVer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista Ellipse, mille ringjoone paksust saab kasutaja slideriga muuta.
 */
public class JavaFX extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack);
        primaryStage.setTitle("Ellips");


        //Ellipsi genereerimine
        Ellipse ellips = new Ellipse(30, 40);
        ellips.setStrokeWidth(1);
        ellips.setStroke(Color.LIMEGREEN);

        Slider slider = new Slider();
        slider.setMin(1);
        slider.setMax(10);
        slider.setValue(10);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);

        //Reageeri Slideri muutumise peale:
        slider.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            //System.out.println("Uus v��rtus on: " + uusVaartus.intValue());
            ellips.setStrokeWidth(uusVaartus.intValue());

        });

        //Paneme lavale ellipsi ja slideri k�lge
        stack.getChildren().addAll(ellips, slider);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


