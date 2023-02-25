package com.ponomic.hospitalmanagementsystem.model;

public class JuniorDoctor extends Doctor {
    private JuniorDoctorGrade grade;

    public JuniorDoctor(String name, JuniorDoctorGrade grade) {
        super(name);
        this.grade = grade;
    }

    public JuniorDoctorGrade getGrade() {
        return grade;
    }

    public void setGrade(JuniorDoctorGrade grade) {
        this.grade = grade;
    }

}
