package jpoial;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;

/** Example of a simple drawing.
 * @author Jaanus
 */
public class DrawEllipse extends Application {

   public static void main (String[] args) {
      launch (args);
   }

   /** Compulsory method for Application.
    * @param myStage JavaFX stage for this application
    */
   @Override
   public void start (Stage myStage) {
      double wdth = 100.; // default
      double hght = 100.;
      try {
         wdth = Double.parseDouble (getParameters().getRaw().get (0));
         hght = Double.parseDouble (getParameters().getRaw().get (1));
      } catch (Exception e) {
         System.out.println ("usage: java jpoial.DrawEllipse width height");
      }
      Pane myPane = new Pane();
      Scene myScene = new Scene (myPane, wdth, hght); // size defined
      myStage.setScene (myScene);
      myStage.setTitle("My own ellipse");
      double w = myScene.getWidth();
      double h = myScene.getHeight();
      Shape myShape = new Ellipse (w/2., h/2., w/2., h/2.);
      ObservableList<Node> nodes = myPane.getChildren();
      nodes.add (myShape);
      myShape.setStroke (Color.BLACK);
      myShape.setFill (Color.WHITE);
      myStage.show();
   }

}
