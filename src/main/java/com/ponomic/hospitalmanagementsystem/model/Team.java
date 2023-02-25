package com.ponomic.hospitalmanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    /**
     * There must be 1 consultant doctor in each team as a team lead
     */
    private ConsultantDoctor teamLead;
    /**
     * List of junior doctors in the team
     */
    private List<JuniorDoctor> juniorDoctors;

    /**
     *
     * @param teamName
     * @param teamLead
     * @param juniorDoctor
     */
    public Team(String teamName, ConsultantDoctor teamLead, JuniorDoctor juniorDoctor) throws IllegalArgumentException {
        if(!juniorDoctor.getGrade().equals(JuniorDoctorGrade.ONE)){
            throw new IllegalArgumentException("Must include a Junior Doctor of Grade 1");
        }
        juniorDoctors = new ArrayList<JuniorDoctor>();
        juniorDoctors.add(juniorDoctor);

        this.teamName = teamName;
        this.teamLead = teamLead;
    }

    public String getTeamName() {
        return teamName;
    }

    public ConsultantDoctor getTeamLead() {
        return teamLead;
    }

    public List<JuniorDoctor> getJuniorDoctors() {
        return juniorDoctors;
    }

    /**
     * Replaces the team lead with another consultant doctor
     * @param teamLead
     */
    public void setTeamLead(ConsultantDoctor teamLead) {
        this.teamLead = teamLead;
    }

    public void addJuniorDoctor(JuniorDoctor juniorDoctor){
        juniorDoctors.add(juniorDoctor);
    }

    /**
     * Can only remove the junior doctor if a junior doctor of grade 1 remains in the team
     * @param juniorDoctor to remove
     * @return true id junior doctor removed successfully, false if junior doctor not removed
     */
    public boolean removeJuniorDoctor(JuniorDoctor juniorDoctor){
        if((!juniorDoctor.getGrade().equals(JuniorDoctorGrade.ONE)) || getNumberOfGradeOnes() > 1){
            juniorDoctors.remove(juniorDoctor);
            return true;
        }
        return false;
    }

    /**
     *
     * @return the total number of grade ones in the team
     */
    private int getNumberOfGradeOnes(){
        int numberOfGradeOnes = 0;
        for(JuniorDoctor docs : juniorDoctors){
            if(docs.getGrade().equals(JuniorDoctorGrade.ONE)){
                numberOfGradeOnes++;
            }
        }
        return numberOfGradeOnes;
    }
}