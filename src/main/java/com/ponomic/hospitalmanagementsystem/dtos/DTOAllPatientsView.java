package com.ponomic.hospitalmanagementsystem.dtos;

public class DTOAllPatientsView {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String teamName;
    private String wardName;

    public DTOAllPatientsView(String firstName, String lastName, String dateOfBirth, String teamName, String wardName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.teamName = teamName;
        this.wardName = wardName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getWardName() {
        return wardName;
    }
}
