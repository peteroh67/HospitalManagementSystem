package com.ponomic.hospitalmanagementsystem.services;

import com.ponomic.hospitalmanagementsystem.dataaccess.*;

import java.util.List;

public class PatientWardService {

    PatientDAO patientDAO;
    PatientsWardsBedsDAO pwbDAO;
    PatientTypesDAO patientTypeDAO;
    WardsDAO wardsDAO;


    public PatientWardService() {
        this.patientDAO = new PatientDAOImpl();
        this.patientTypeDAO = new PatientTypesDAOImpl();
        this.pwbDAO = new PatientsWardsBedsDAOImpl();
        this.wardsDAO = new WardsDAOImpl();
    }

    public List getAllPatients() {
        return patientDAO.readAllPatients();
    }

    public List getAllPatientsView(){
        return patientDAO.readAllPatientsView();
    }
}
