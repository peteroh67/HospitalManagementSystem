package com.ponomic.hospitalmanagementsystem.model;

import java.util.HashMap;
import java.util.Map;

public class Ward {

    /**
     * A unique ward name
     */
    private String wardName;
    /**
     * Male, Female or Paediatric
     */
    private PatientType patientType;
    /**
     * The total number of beds on the ward/ maximum number of patients on the ward
     */
    private int capacity;
    /**
     * The key Integer is the bed number. The value is the patient in the bed
     */
    private Map<Integer, Patient> patients;

    /**
     *
     * @param wardName must meet the validation criteria for length
     * @param patientType Male, Female or Paediatric
     * @param capacity must meet the validation criteria between min and max value
     */
    public Ward(String wardName, PatientType patientType, int capacity) {
        this.wardName = wardName;
        this.patientType = patientType;
        this.capacity = capacity;
        patients = new HashMap<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName){
        this.wardName = wardName;
    }

    public PatientType getPatientType() {
        return patientType;
    }

    public void setPatientType(PatientType patientType){
        this.patientType = patientType;
    }

    /**
     * Returns a copy of the patient map so that changes must be made through the Ward object
     * @return HashMap<Patient>
     */
    public Map<Integer, Patient> getWardPatients() {
        return new HashMap<>(patients);
    }

    /**
     * Checks there is a free bed. If a bed is free the patient is added to the ward
     * @param patient to be added
     * @return true if the patient is added to a free bed or false if no bed is free
     */
    public boolean addPatient(Patient patient) {

        if(isPatientTypeSameAsWardType(patient)){
            return false;
        }
        if(patients.size() < this.capacity){
            patients.put((patients.size()+1), patient);
            return true;
        }
        return false;
    }

    public int getPatientsBedNumber(Patient patient){
        for(Integer bed : patients.keySet()){
            if(patients.get(bed).equals(patient)){
                return bed;
            }
        }
        return -1;
    }

    private boolean isPatientTypeSameAsWardType(Patient patient) {
        return patient.getPatientType().equals(this.getPatientType());
    }

    public int getNumberOfFreeBeds(){
        return capacity - patients.size();
    }

    public Patient getPatientInBedNumber(int bedNumber){
        return patients.get(bedNumber);
    }

    public int getPercentageOfBedsInUse(){
        return (patients.size() / this.capacity) * 100;
    }
}
