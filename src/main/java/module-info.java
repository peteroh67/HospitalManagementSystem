module com.ponomic.hospitalmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.ponomic.hospitalmanagementsystem to javafx.fxml;
    exports com.ponomic.hospitalmanagementsystem;
    exports com.ponomic.hospitalmanagementsystem.controllers;
    opens com.ponomic.hospitalmanagementsystem.controllers to javafx.fxml;
}