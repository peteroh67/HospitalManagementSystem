package com.ponomic.hospitalmanagementsystem.model;

import java.time.LocalDate;

public class Patient {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private PatientType patientType;
    private int ID;

    public Patient(String firstName, String lastName, LocalDate dateOfBirth, PatientType patientType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.patientType = patientType;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public PatientType getPatientType() {
        return this.patientType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatientType(PatientType patientType) {
        this.patientType = patientType;
    }
}
