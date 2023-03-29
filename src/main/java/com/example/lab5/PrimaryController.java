package com.example.lab5;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {
    @FXML private TableColumn col_imie; 
    @FXML private TableColumn col_nazwisko;
    @FXML private TableColumn col_id;
    @FXML private TableView tabela;
    @FXML private TextField t_imie;
    @FXML private TextField t_nazwisko;
    @FXML public void initialize(){
    col_imie.setCellValueFactory(
            new PropertyValueFactory<>("imie"));
    col_nazwisko.setCellValueFactory(
            new PropertyValueFactory<>("nazwisko"));
        col_id.setCellValueFactory(
                new PropertyValueFactory<>("id"));
    

    ObservableList<Osoba> lista=FXCollections.observableArrayList();
    lista.add(new Osoba("a","b",1));
        lista.add(new Osoba("c","d",2));
        lista.add(new Osoba("e","f",3));
        lista.add(new Osoba("g","h",4));
    //dodaj elementy listy
    tabela.getItems().addAll(lista);
        TableView.TableViewSelectionModel<Osoba> selectionModel = tabela.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.SINGLE);//Może być multiple
        ObservableList<Osoba> selectedItems =
                selectionModel.getSelectedItems();
        selectedItems.addListener(
                new ListChangeListener<Osoba>() {
                    @Override
                    public void onChanged(
                            Change<? extends Osoba> change) {
                        Osoba os=change.getList().get(0);
                        t_imie.setText(os.getImie());
                        t_nazwisko.setText(os.getNazwisko());
                    }
                });
        //tabela.getItems().size()+1;
    }
    @FXML public void dodaj(){
        tabela.getItems().add(new Osoba(t_imie.getText(),t_nazwisko.getText(),tabela.getItems().size()+1));
    }
/*

}*/
}
