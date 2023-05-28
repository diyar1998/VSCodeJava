package javafxapplication12;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author 49179
 */
public class JavaFXApplication11 extends Application {

    @Override
    public void start(Stage stage) {
        Button blau = new Button("Blau");
        Button gruen = new Button("Grün");
        Parent p = new MyParent(blau, gruen);

        Scene szene = new Scene(p);
        stage.setScene(szene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public class MyParent extends Parent {
        public MyParent(Button blau, Button gruen) {
            gruen.setLayoutX(100.0);
            gruen.setLayoutY(0.0);
            ObservableList<javafx.scene.Node> liste = getChildren();
            liste.addAll(blau, gruen);
        }
    }
}
