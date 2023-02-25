package com.ponomic.hospitalmanagementsystem.dataaccess;

import com.ponomic.hospitalmanagementsystem.model.Patient;

import java.util.List;

public interface PatientDAO {

    public List<Patient> readAllPatients();
    public Patient readPatientByID(int patientID);
    public int insertPatient(Patient patient);
    public boolean updatePatient(Patient patient);
    public boolean deletePatient(Patient patient);

}
