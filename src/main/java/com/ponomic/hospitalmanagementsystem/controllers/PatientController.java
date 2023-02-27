package com.ponomic.hospitalmanagementsystem.controllers;

import com.ponomic.hospitalmanagementsystem.model.Patient;
import com.ponomic.hospitalmanagementsystem.services.PatientWardService;
import com.ponomic.hospitalmanagementsystem.utilities.WindowLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PatientController {
    @FXML
    private Button btnAdmitPatient;
    @FXML
    private Button btnViewPatients;
    private PatientWardService patientWardService;

    public void onButtonClick(ActionEvent event) {

        if(event.getSource().equals(btnAdmitPatient)){
            loadNewWindow("/com.ponomic.hospitalmanagementsystem.view/AdmitPatientView.fxml", event);
        } else if(event.getSource().equals(btnViewPatients)){
            getViewPatientsInput();
        }

    }

    private void getViewPatientsInput() {

    }

    private void loadNewWindow(String fxmlFilePath, ActionEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        WindowLoader.loadWindow(fxmlFilePath, stage);
    }

    private void displayAllPatients(){

        patientWardService = new PatientWardService();
        patientWardService.getAllPatients();

    }
}
