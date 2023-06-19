package com.example.lab2;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class HelloController {
    @FXML
    private Label liczba;
    @FXML
    private ImageView obrazek;
    @FXML
    protected void blue() {
        liczba.setStyle("-fx-text-fill: blue;");
    }
    @FXML
    protected void green() {
        liczba.setStyle("-fx-text-fill: green;");
    }
    @FXML
    protected void red() {
        liczba.setStyle("-fx-text-fill: red;");
    }

    @FXML
    protected void one() {
        liczba.setText("1");
    }
    @FXML
    protected void two() {
        liczba.setText("2");
    }
    @FXML
    protected void three() {
        liczba.setText("3");
    }

    @FXML
    private void show_calendar() {
        obrazek.setImage(new Image(getClass().getResourceAsStream("Calendar.jpg")));
    }
    @FXML
    private void show_contacts() {
        obrazek.setImage(new Image(getClass().getResourceAsStream("Contacts.jpg")));
    }
    @FXML
    private void show_home() {
        obrazek.setImage(new Image(getClass().getResourceAsStream("Home.jpg")));
    }
    @FXML
    protected void exit() {
        Platform.exit();
    }

    @FXML
    protected void blur() {
        MotionBlur mb = new MotionBlur();
        mb.setRadius(15.0f);
        mb.setAngle(45.0f);
        liczba.setEffect(mb);liczba.setEffect(null);
    }
    @FXML
    protected void normal() {
liczba.setEffect(null);
    }
    @FXML
    protected void spin() {
         Timeline timeline = new Timeline();
        timeline.setCycleCount(1);
        //timeline.setAutoReverse(true);
         KeyValue kv = new KeyValue(obrazek.rotateProperty(), 360);
         KeyFrame kf = new KeyFrame(Duration.millis(500), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();
        //timeline.stop();
        //obrazek.setRotate(180);
        timeline.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                obrazek.setRotate(0);
            }
        });
    }
}