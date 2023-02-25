package com.ponomic.hospitalmanagementsystem.dataaccess;

import java.time.format.DateTimeFormatter;

public class Schema {

    public static final String SQLITE_DB_NAME = "hospitalfx.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:" + SQLITE_DB_NAME;
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

    public static final int DEFAULT_ID_VALUE = -1;

    // PATIENTS table
    public static final String TABLE_PATIENTS = "patients";
    public static final String COLUMN_PATIENTS_ID = "pk_patient_id";
    public static final String COLUMN_PATIENTS_PATIENT_TYPE = "fk_patients_ type_patient_id";
    public static final String COLUMN_PATIENTS_HEALTH_NUMBER = "health_number";

    public static final String COLUMN_PATIENTS_FIRST_NAME = "first_name";
    public static final String COLUMN_PATIENTS_LAST_NAME = "last_name";
    public static final String COLUMN_PATIENTS_DATE_OF_BIRTH = "date_of_birth";
    public static final int INDEX_PATIENT_ID = 1;
    public static final int INDEX_PATIENT_PATIENT_TYPE = 2;
    public static final int INDEX_PATIENT_FIRST_NAME = 3;
    public static final int INDEX_PATIENT_LAST_NAME = 4;
    public static final int INDEX_PATIENT_DATE_OF_BIRTH = 5;


    // WARDS table
    public static final String TABLE_WARDS = "wards";
    public static final String COLUMN_WARDS_ID = "ward_id";
    public static final String COLUMN_WARDS_PATIENT_TYPE = "fk_patient_type_ward_id";
    public static final String COLUMN_WARDS_NAME = "ward_name";
    public static final String COLUMN_WARDS_CAPACITY = "capacity";
    public static final int INDEX_WARD_ID = 1;
    public static final int INDEX_WARD_PATIENT_TYPE = 2;
    public static final int INDEX_WARD_NAME = 3;
    public static final int INDEX_WARD_CAPACITY = 4;


    // DOCTORS table
    public static final String TABLE_DOCTOR = "doctors";
    public static final String COLUMN_DOCTORS_ID = "pk_doctor_id";
    public static final String COLUMN_DOCTORS_FIRSTNAME = "first_name";
    public static final String COLUMN_DOCTORS_LASTNAME = "last_name";
    public static final int INDEX_DOCTOR_ID = 1;
    public static final int INDEX_DOCTOR_FIRST_NAME = 2;
    public static final int INDEX_DOCTOR_LAST_NAME = 3;



    // JUNIOR_DOCTORS table
    public static final String TABLE_JUNIOR_DOCTOR = "junior_doctors";
    public static final String COLUMN_JUNIOR_DOCTOR_ID = "pk_junior_dr_id";
    public static final String COLUMN_JUNIOR_DOCTOR_DOCTOR = "fk_doctor_jr_dr_id";
    public static final String COLUMN_JUNIOR_DOCTOR_TEAM = "fk_team_jr_dr_id";
    public static final String COLUMN_JUNIOR_DOCTOR_GRADE = "grade";
    public static final int INDEX_JUNIOR_DOCTOR_ID = 1;
    public static final int INDEX_JUNIOR_DOCTOR_DOCTOR = 2;
    public static final int INDEX_JUNIOR_DOCTOR_TEAM = 3;
    public static final int INDEX_JUNIOR_DOCTOR_GRADE = 4;



    // TREATMENTS table
    public static final String TABLE_TREATMENT = "treatments";
    public static final String COLUMN_TREATMENTS_ID = "pk_treatment_id";
    public static final String COLUMN_TREATMENTS_DOCTOR = "fk_doctor_treatment_id";
    public static final String COLUMN_TREATMENTS_PATIENT = "fk_patient_treatment_id ";
    public static final String COLUMN_TREATMENTS_DESC = "description";
    public static final String COLUMN_TREATMENTS_DATETIME = "date_time";
    public static final int INDEX_TREATMENTS_ID = 1;
    public static final int INDEX_TREATMENTS_DOCTOR = 2;
    public static final int INDEX_TREATMENTS_PATIENT = 3;
    public static final int INDEX_TREATMENTS_DESC = 4;
    public static final int INDEX_TREATMENTS_DATETIME = 5;



    // TEAMS table
    public static final String TABLE_TEAM = "teams";
    public static final String COLUMN_TEAM_ID = "pk_team_id";
    public static final String COLUMN_TEAM_DOCTOR = "fk_doctor_team_id";
    public static final int INDEX_TEAM_ID = 1;
    public static final int INDEX_TEAM_DOCTOR = 2;



    // PATIENTS_WARDS_BEDS table
    public static final String TABLE_PATIENTS_WARDS_BED = "patients_wards_beds";
    public static final String COLUMN_PATIENTS_WARDS_BEDS_ID = "pk_patient_ward_bed_id";
    public static final String COLUMN_PATIENTS_WARDS_BEDS_WARD = "fk_ward_id";
    public static final String COLUMN_PATIENTS_WARDS_BEDS_PATIENT = "fk_patient_id";
    public static final String COLUMN_PATIENTS_WARDS_BEDS_BED_NUMBER = "bed_number";
    public static final int INDEX_PATIENTS_WARDS_BEDS_ID = 1;
    public static final int INDEX_PATIENTS_WARDS_BEDS_WARD = 2;
    public static final int INDEX_PATIENTS_WARDS_BEDS_PATIENT = 3;
    public static final int INDEX_PATIENTS_WARDS_BEDS_BED_NUMBER = 4;



    // PATIENT_TYPES table
    public static final String TABLE_PATIENT_TYPES = "patient_types";
    public static final String COLUMN_PATIENT_TYPES_ID = "pk_patient_type_id";
    public static final String COLUMN_PATIENT_TYPES_PATIENT_TYPE = "patient_type";
    public static final int INDEX_PATIENT_TYPES_ID = 1;
    public static final int INDEX_PATIENT_TYPES_PATIENT_TYPE = 2;


    // Ordering
    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;

}
