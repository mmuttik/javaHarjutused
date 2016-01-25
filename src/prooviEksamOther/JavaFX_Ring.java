package prooviEksamOther;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * Joonista ring, mille suurust ja ääre paksust saab muuta.
 */
public class JavaFX_Ring extends Application {

    Stage stage;
    StackPane s;
    Scanner sc;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        s = new StackPane();

        Circle ring = new Circle(100);
        ring.setFill(Color.WHITE);
        ring.setStroke(Color.BLACK);
        ring.setStrokeWidth(3);

        ring.setOnMouseDragged( event -> {
            Point2D pmouse = new Point2D(event.getX(), event.getY());
            for (Node n : s.getChildren()) {
                if (n instanceof Circle) {
                    Circle c = (Circle) n;
                    Point2D pc = new Point2D(c.getCenterX(), c.getCenterY());
                    double r = pc.distance(pmouse);
                    c.setRadius(r);
//                    c.setStrokeWidth(r);
                }
            }
        });

        s.getChildren().addAll(ring);

        Scene scene = new Scene(s, 800, 600);
        stage.setScene(scene);
        stage.show();

    }

    /*// PeeterP variant (Slider)
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack);
        Circle circle = new Circle(300);
        stack.getChildren().add(circle);

        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(300);
        stack.getChildren().add(slider);
        slider.setTranslateY(290);

        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            circle.setRadius(newValue.intValue());
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }*/
}
