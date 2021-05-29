package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import javax.naming.Context;
import java.io.FileNotFoundException;


public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        ReadOnlyDoubleProperty widthProperty = pane.widthProperty();
        widthProperty.addListener( new ChangeListener<Number>(){
            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldVal, Number newVal) {

                System.out.println("widthProperty changed from "
                        + oldVal.doubleValue() + " to " + newVal.doubleValue());
            }
        });


        DoubleProperty prefWidthProperty = pane.prefWidthProperty();
        prefWidthProperty.addListener(
                (ObservableValue<? extends Number> prop,
                 Number oldVal, Number newVal) -> {

                    System.out.println("prefWidthProperty changed from "
                            + oldVal.doubleValue() + " to " + newVal.doubleValue());
                });

        prefWidthProperty.set(123);

        Scene scene = new Scene(pane, 1024, 800, true);
        primaryStage.setScene(scene);
        primaryStage.setTitle("2D Example");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
