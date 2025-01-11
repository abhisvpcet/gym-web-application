package com.example.gym_web_project1.adapters.out.mysql.entities;

import jakarta.persistence.*;


@Entity
@Table(name="TrainerTable")
public class TrainerEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String trainerName;

    private String trainerDesignation;

    private String trainerType;


    public TrainerEntity() {
    }

    public TrainerEntity(String trainerName, String trainerDesignation, String trainerType) {
        this.trainerName = trainerName;
        this.trainerDesignation = trainerDesignation;
        this.trainerType = trainerType;
    }

    @Override
    public String toString() {
        return "TrainerEntity{" +
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
