package com.example.gym_web_project1.adapters.out.mysql.entities;


import jakarta.persistence.*;
@Entity
@Table(name="GymTable")
public class GymEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer id;

     String gymType;

     String gymFee;

     String gymLocation;

     @Version
     private Integer version;



    public GymEntity() {

        // Required by JPA
    }


    public GymEntity(String gymType, String gymFee, String gymLocation) {
        this.gymType = gymType;
        this.gymFee = gymFee;
        this.gymLocation = gymLocation;
    }


    @Override
    public String toString() {
        return "GymEntity{" +
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}