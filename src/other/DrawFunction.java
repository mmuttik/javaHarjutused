package other;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.collections.ObservableList;
import java.util.function.Function;

/** Example of passing a function as a parameter.
 * @author Jaanus
 */
public class DrawFunction extends Application {

    public static void main (String[] args) {
        launch (args);
    }

    /** Compulsory method for Application.
     * @param myStage JavaFX main stage for this application
     */
    @Override
    public void start (Stage myStage) {
        Function<Double, Double> fn = Math::sin;
        double from = 0.;
        double to = 2.*Math.PI;
        Pane myPane = new Pane();
        Scene myScene = new Scene (myPane, 250, 100);
        myStage.setScene (myScene);
        myStage.setTitle ("Graph of a function");
        ObservableList<Node> nodes = myPane.getChildren();
        drawFunction (fn, from, to, myScene.getWidth(), myScene.getHeight(), nodes);
        myScene.widthProperty().addListener (
                (obsv, oldv, newv) -> {
                    drawFunction (fn, from, to, myScene.getWidth(), myScene.getHeight(), nodes);
                });
        myScene.heightProperty().addListener (
                (obsv, oldv, newv) -> {
                    drawFunction (fn, from, to, myScene.getWidth(), myScene.getHeight(), nodes);
                });
        myStage.show();
    }

    /** Method to draw the graph of a function.
     * @param f function
     * @param start from argument value
     * @param end to argument value
     * @param w width of the pane
     * @param h height of the pane
     * @param nl contents of the pane
     */
    public static void drawFunction (Function<Double,Double> f, double start, double end,
      double w, double h, ObservableList<Node> nl) {
        int iw = (int)w;
        Double[] points = new Double[2*iw];
        double fmax = Double.MIN_VALUE;
        double fmin = Double.MAX_VALUE;
        for (int i=0; i < iw; i++) {
            double arg = start + ((double)i)*(end-start)/w;
            double value = f.apply (arg);
            points[2*i] = (double)i;
            points[2*i+1] = value; // to be scaled later
            if (value > fmax) fmax = value;
            if (value < fmin) fmin = value;
        }
        for (int i=0; i < iw; i++) {
            double value = points[2*i+1];
            points[2*i+1] = (fmax-value)*h/(fmax-fmin); // scaling
        }
        Polyline graph = new Polyline();
        graph.getPoints().addAll (points);
        nl.clear();
        nl.add (graph);
    }
}
