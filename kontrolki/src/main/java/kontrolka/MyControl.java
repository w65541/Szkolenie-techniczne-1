package kontrolka;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MyControl extends VBox {
    private @FXML TextField text_field; //pole tekstowe, nadaj mu odpowiedni fx:id
    private String my_text;

    public MyControl(){
        super();
        FXMLLoader fxmlLoader = new
                FXMLLoader(getClass().getResource("MyControl.fxml"));
        fxmlLoader.setController(this);
        try {
            Node n=fxmlLoader.load();
            this.getChildren().add(n);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @FXML
    public void get()
    {
        my_text=text_field.getText();
    }

    @FXML
    public void set() {text_field.setText(my_text);}
    private EventHandler<ActionEvent> click;
    public void setOnAction(EventHandler<ActionEvent> event){
        click = event;
        this.addEventHandler(ActionEvent.ACTION, click);
    }
    public EventHandler<ActionEvent> getOnAction(){
        return click;
    }
}