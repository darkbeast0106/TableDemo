module com.example.tabledemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tabledemo to javafx.fxml;
    exports com.example.tabledemo;
}