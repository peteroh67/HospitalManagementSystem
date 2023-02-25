package com.ponomic.hospitalmanagementsystem.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button btnDashboard;
    @FXML
    private Button btnWards;
    @FXML
    private Button btnTreatments;
    @FXML
    private Button btnPatients;
    @FXML
    private Button btnTeams;
    @FXML
    private Button btnHelp;

    @FXML
    protected void onButtonClick(ActionEvent event) {

        String fxmlFilePath = "";

        if(event.getSource().equals(btnDashboard)){
            fxmlFilePath = "com/ponomic/hospitalmanagement/View/HelloView.fxml";
        } else if (event.getSource().equals(btnWards)) {
            fxmlFilePath = "com/ponomic/hospitalmanagement/View/wards.fxml";
        } else if (event.getSource().equals(btnTreatments)) {
            fxmlFilePath = "com/ponomic/hospitalmanagement/View/treatments.fxml";
        } else if (event.getSource().equals(btnPatients)) {
            fxmlFilePath = "com/ponomic/hospitalmanagement/View/patients.fxml";
        } else if (event.getSource().equals(btnTeams)) {
            fxmlFilePath = "com/ponomic/hospitalmanagement/View/teams.fxml";
        } else if (event.getSource().equals(btnHelp)) {
            fxmlFilePath = "com/ponomic/hospitalmanagement/View/help.fxml";
        }

        loadNewWindow(fxmlFilePath, event);

    }

    private void loadNewWindow(String fxmlFilePath, ActionEvent event) {

        double height= ((Node) event.getSource()).getScene().getHeight();
        double width= ((Node) event.getSource()).getScene().getWidth();

        try {
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFilePath));
            stage.setScene(new Scene(root, width, height));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}