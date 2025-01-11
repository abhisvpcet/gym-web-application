package com.example.gym_web_project1.adapters.out.mysql.repositories;

import com.example.gym_web_project1.adapters.out.mysql.entities.TrainerEntity;
import com.example.gym_web_project1.domain.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainerRepositories extends JpaRepository<TrainerEntity, Integer> {

    @Query("SELECT g FROM TrainerEntity g WHERE g.trainerName = :trainerName")
    Optional<TrainerEntity> findByTrainerName(String trainerName);
}
