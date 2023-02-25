package com.ponomic.hospitalmanagementsystem.model;

import java.time.LocalDateTime;

public class Treatment {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime dateTime;
    private String treatmentDescription;

    public Treatment(Doctor doctor, Patient patient, String treatmentDescription) {
        this.doctor = doctor;
        this.patient = patient;
        this.treatmentDescription = treatmentDescription;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

}
