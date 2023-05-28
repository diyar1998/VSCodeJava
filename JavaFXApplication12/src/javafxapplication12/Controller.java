package javafxapplication12;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;
    private int x, y;

    public void Right() {
        myCircle.setCenterX(x += 10);
        System.out.println("RIGHT " + myCircle.getCenterX());
    }

    public void Left() {
        myCircle.setCenterX(x -= 10);
        System.out.println("LEFT: " + myCircle.getCenterX());
    }

    public void Up() {
        myCircle.setCenterY(y -= 10);
        System.out.println("UP " + myCircle.getCenterY());
    }

    public void Down() {
        myCircle.setCenterY(y += 10);
        System.out.println("DOWN " + myCircle.getCenterY());
    }

}
