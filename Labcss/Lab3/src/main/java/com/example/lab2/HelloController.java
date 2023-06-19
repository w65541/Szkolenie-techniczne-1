package com.example.lab2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
}