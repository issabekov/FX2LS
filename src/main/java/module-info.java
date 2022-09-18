module com.example.fx2ls {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx2ls to javafx.fxml;
    exports com.example.fx2ls;
}