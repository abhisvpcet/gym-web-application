package com.example.gym_web_project1.application.dto;

public class TrainerDto {

    private String trainerName;

    private String trainerDesignation;

    private String trainerType;

    public TrainerDto() {
    }

    @Override
    public String toString() {
        return "TrainerDto{" +
                "trainerName='" + trainerName + '\'' +
                ", trainerDesignation='" + trainerDesignation + '\'' +
                ", trainerType='" + trainerType + '\'' +
                '}';
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
