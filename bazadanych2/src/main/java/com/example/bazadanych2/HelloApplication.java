package com.example.bazadanych2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.sql.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Connection c;
        Statement s;
        ResultSet r;

        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/szkola","root","root");
            s=c.createStatement();
            r=s.executeQuery("select * from student");
            wyswietl(r);
            r=s.executeQuery("SELECT * FROM szkola.student where left(nazwisko,1)=\"a\";");
            wyswietl(r);
            r=s.executeQuery("SELECT imie,nazwisko, idprzedmiot,ocena FROM szkola.oceny inner join student;");
            wyswietl(r);
            r=s.executeQuery("SELECT imie,nazwisko, nazwa FROM oceny left join student on idstudent=student.id left join przedmiot on idprzedmiot=przedmiot.id;");
            wyswietl(r);
            r=s.executeQuery("SELECT imie,nazwisko, nazwa ,ocena FROM oceny left join student on idstudent=student.id left join przedmiot on idprzedmiot=przedmiot.id where ocena!=\"F\";");
            wyswietl(r);
            s.close();
c.close();
        }catch (Exception e){
            e.printStackTrace();

        }
        launch();
    }
    public static void wyswietl(ResultSet r){
        try {
            if(r!=null) {
                ResultSetMetaData rsmd = r.getMetaData();
                String[] row = new String[rsmd.getColumnCount()];
                for (int i = 1; i < rsmd.getColumnCount() + 1; i++) {
                    row[i - 1] = rsmd.getColumnName(i);
                }
                String[][] column = new String[0][0];
                //data = new DefaultTableModel(column, row);
                String[] roww = new String[rsmd.getColumnCount()];
                while (r.next()) {
                    for (int i = 1; i < rsmd.getColumnCount() + 1; i++) {
                        roww[i - 1] = r.getString(i);
                    }
                    //data.addRow(roww);
                    for (String x:roww
                    ) {
                        System.out.print(x+" ");
                    }
                    System.out.println();
                }
                //table1.setModel(data);
            }}catch (Exception e){
            e.printStackTrace();
        }

    }
}