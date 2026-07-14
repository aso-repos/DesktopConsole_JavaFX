package DesktopConsole;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start (Stage stage) throws Exception {

        Font.loadFont(getClass().getResourceAsStream("/fonts/Roboto-Medium.ttf"),12);

        Parent root = FXMLLoader.load(getClass().getResource("/FXML/DesktopConsole.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setResizable(false);
        //stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);



        stage.show();
    }

    public static void main (String[] args) {
        launch(args);
    };
}
