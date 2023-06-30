module com.example.programowanierownolegle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.programowanierownolegle to javafx.fxml;
    exports com.example.programowanierownolegle;
}