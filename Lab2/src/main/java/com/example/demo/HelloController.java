package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label wynik,d;
    @FXML
    private TextField a,b,c;
    @FXML
    protected void add() throws Exception{
        try{
            int w=Integer.parseInt(a.getText())+Integer.parseInt(b.getText());
            wynik.setText(Integer.toString(w));
        }catch (Exception e){
            wynik.setText("Popraw");
        }

    }
    @FXML
    protected void remove() throws Exception{
        try{
            int w=Integer.parseInt(a.getText())-Integer.parseInt(b.getText());
            wynik.setText(Integer.toString(w));
        }catch (Exception e){
            wynik.setText("Popraw");
        }

    }
    @FXML
    protected void multiply() throws Exception{
        try{
            int w=Integer.parseInt(a.getText())*Integer.parseInt(b.getText());
            wynik.setText(Integer.toString(w));
        }catch (Exception e){
            wynik.setText("Popraw");
        }

    }

    @FXML
    protected void divide() throws Exception{
        try{
            double w=Double.parseDouble(a.getText())/Double.parseDouble(b.getText());
            wynik.setText(Double.toString(w));
        }catch (Exception e){
            wynik.setText("Popraw");
        }

    }
    @FXML
    protected void licznik() throws Exception{
        try{
            int w1=c.getText().length();
            String ciag=c.getText().replace(" ","");
            int w2=0;
            String[] slowa=c.getText().split(" ");
            for (int i=0;i<slowa.length;i++){
                if(!slowa[i].isBlank())w2++;
            }
            d.setText("Znaki: "+w1+"\nZnaki bez spacji: "+ciag.length()+" \nLiczba słów: "+w2);
        }catch (Exception e){
            wynik.setText("Popraw");
        }

    }
}