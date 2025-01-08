package com.example.gym_web_project1.domain;



public class Gym {

    private Integer id;

    private String gymType;

    private String gymFee;

    private String gymLocation;

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", gymType='" + gymType + '\'' +
                ", gymFee='" + gymFee + '\'' +
                ", gymLocation='" + gymLocation + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
