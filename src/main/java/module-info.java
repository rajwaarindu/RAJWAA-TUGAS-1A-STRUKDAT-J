module org.example.strukdat1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.strukdat1 to javafx.fxml;
    exports org.example.strukdat1;
}