package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label wynik;
    @FXML
    private TextField a,b;
    @FXML
    protected void add() throws Exception{
        try{
            int w=Integer.parseInt(a.getText())+Integer.parseInt(b.getText());
            wynik.setText(Integer.toString(w));
        }catch (Exception e){
            wynik.setText("Popraw");
        }

    }
}