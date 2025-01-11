package com.example.gym_web_project1.application.dao;

import com.example.gym_web_project1.adapters.out.mysql.entities.TrainerEntity;
import com.example.gym_web_project1.domain.Trainer;

import java.util.List;
import java.util.Optional;

public interface TrainerDao {

    public void saveTrainer(Trainer trainer);

    public List<TrainerEntity> findAll();
    ;
    public void updateTrainer(TrainerEntity trainerEntity);

    Optional<TrainerEntity> findByTrainerName(String trainerName);

    public Optional<TrainerEntity> findById(Integer id);
}
