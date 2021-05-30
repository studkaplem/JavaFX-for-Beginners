package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.geometry.VPos;
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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import javax.naming.Context;
import java.io.FileNotFoundException;


public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) {

        Text text = new Text("This is a JavaFX text\n" +
                "This is a longer JavaFX text.");
        text.setWrappingWidth(180);
        text.setFont(Font.font("Arial Black", FontWeight.LIGHT, 16));
        text.setFill(Color.DARKBLUE);
        text.setStroke(Color.RED);
        text.setTextOrigin(VPos.BOTTOM);
        text.setUnderline(true);
        text.setFontSmoothingType(FontSmoothingType.LCD);


        Text text1 = new Text();
        text1.setText("another JavaFX text");
        text1.setFont(Font.font("Arial",FontWeight.LIGHT, 15));
        text1.setFill(Color.GREEN);
        text1.setStrikethrough(true);
        text.setFontSmoothingType(FontSmoothingType.GRAY);


        Scene scene = new Scene(new VBox(text, text1), 200, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
