package com.example.gym_web_project1.application.dto;

public class GymDto {


    private String gymType;

    private String gymFee;

    private String gymLocation;

    public GymDto() {
    }

    @Override
    public String toString() {
        return "GymDto{" +
                "gymType='" + gymType + '\'' +
                ", gymFee='" + gymFee + '\'' +
                ", gymLocation='" + gymLocation + '\'' +
                '}';
    }

    public String getGymType() {
        return gymType;
    }

    public void setGymType(String gymType) {
        this.gymType = gymType;
    }

    public String getGymFee() {
        return gymFee;
    }

    public void setGymFee(String gymFee) {
        this.gymFee = gymFee;
    }

    public String getGymLocation() {
        return gymLocation;
    }

    public void setGymLocation(String gymLocation) {
        this.gymLocation = gymLocation;
    }
}
