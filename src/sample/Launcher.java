package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import javax.naming.Context;
import java.io.FileNotFoundException;


public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception, FileNotFoundException{
        primaryStage.setTitle("First JavaFX App");

        VBox vBox = new VBox(new Label("A JavaFX Label"));
        Scene scene = new Scene(vBox, 200,200);
        scene.setCursor(Cursor.CLOSED_HAND);
        primaryStage.setX(20);
        primaryStage.setY(50);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
