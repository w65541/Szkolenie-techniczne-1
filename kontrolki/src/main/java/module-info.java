module com.example.kontrolki {
    exports com.example.kontrolki;
    opens com.example.kontrolki to javafx.fxml;
    requires javafx.controls;
    requires javafx.fxml;
    exports kontrolka;
}
