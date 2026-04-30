package DesktopConsole;

import javafx.animation.Animation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class ConsoleView implements Initializable {

    @FXML
    private Button helloButton;
    @FXML
    private Label infoLabel;
    @FXML
    private Label dayLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private Label timeLabel;
    @FXML
    private ImageView weatherIcon;
    @FXML
    private Label currentTemp;
    @FXML
    private Label minTemp;
    @FXML
    private Label maxTemp;

    ConsoleLogic logic = new ConsoleLogic();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Font.loadFont(getClass().getResourceAsStream("/fonts/Roboto-Medium.ttf"),12);

        // Set up timer and duration length and call method to be updated
        Timeline refreshDisplay = new Timeline(new KeyFrame(Duration.minutes(1), event -> {
            updateLeftDisplay();
        }));

        // Set initial date and time
        updateLeftDisplay();

        // Run refreshDisplay indefinitely
        refreshDisplay.setCycleCount(Animation.INDEFINITE);
        refreshDisplay.play();

        setWeatherIcon(logic.getWeatherIconName("snow"));

        updateCurrentTemp();
        updateMinMaxTemp();

    }

    public void updateLeftDisplay () {

        String currentDay = logic.getCurrentDay();
        dayLabel.setText(currentDay);

        String currentDate = logic.getCurrentDate();
        dateLabel.setText(currentDate);

        String currentTime = logic.getCurrentTime();
        timeLabel.setText(currentTime);
    }

    @FXML
    public void infoButtonClicked (ActionEvent event) {

        infoLabel.setText("Congratulations, this will be your future Reminder Bar");
    }

    public void setWeatherIcon (String newIcon) {
        String path = "/images/" + newIcon + ".png";
        weatherIcon.setImage(new Image(path));
    }

    // Test current Temperature Label
    public void updateCurrentTemp () {

        currentTemp.setText("27°C");
    }

    // Test min/max Temperature Labels
    public void updateMinMaxTemp () {
        minTemp.setText("7°C");
        maxTemp.setText("39°C");
    }

}
