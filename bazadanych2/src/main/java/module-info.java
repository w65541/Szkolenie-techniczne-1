module com.example.bazadanych2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bazadanych2 to javafx.fxml;
    exports com.example.bazadanych2;
}