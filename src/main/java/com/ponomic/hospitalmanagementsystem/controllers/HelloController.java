package com.ponomic.hospitalmanagementsystem.controllers;

import com.ponomic.hospitalmanagementsystem.utilities.WindowLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button btnDashboard;
    @FXML
    private Button btnWards;
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
            fxmlFilePath = "/com/ponomic/hospitalmanagementsystem/view/DashboardView.fxml";
        } else if (event.getSource().equals(btnWards)) {
            fxmlFilePath = "/com/ponomic/hospitalmanagementsystem/view/AllWardsView.fxml";
        } else if (event.getSource().equals(btnPatients)) {
            fxmlFilePath = "/com/ponomic/hospitalmanagementsystem/view/AllPatientsView.fxml";
        } else if (event.getSource().equals(btnTeams)) {
            fxmlFilePath = "/com/ponomic/hospitalmanagementsystem/view/AllTeamsView.fxml";
        } else if (event.getSource().equals(btnHelp)) {
            fxmlFilePath = "/com/ponomic/hospitalmanagementsystem/view/HelpView.fxml";
        }

        loadNewWindow(fxmlFilePath, event);
    }

    private void loadNewWindow(String fxmlFilePath, ActionEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        WindowLoader.loadWindow(fxmlFilePath, stage);
    }
}