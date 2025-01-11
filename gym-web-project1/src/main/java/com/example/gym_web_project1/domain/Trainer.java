package com.example.gym_web_project1.domain;

public class Trainer {

    private Integer id;

    private String trainerName;

    private String trainerDesignation;

    private String trainerType;

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", trainerName='" + trainerName + '\'' +
                ", trainerDesignation='" + trainerDesignation + '\'' +
                ", trainerType='" + trainerType + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerDesignation() {
        return trainerDesignation;
    }

    public void setTrainerDesignation(String trainerDesignation) {
        this.trainerDesignation = trainerDesignation;
    }

    public String getTrainerType() {
        return trainerType;
    }

    public void setTrainerType(String trainerType) {
        this.trainerType = trainerType;
    }
}
