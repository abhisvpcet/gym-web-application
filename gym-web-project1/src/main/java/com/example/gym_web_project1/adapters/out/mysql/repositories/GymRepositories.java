package com.example.gym_web_project1.adapters.out.mysql.repositories;

import com.example.gym_web_project1.adapters.out.mysql.entities.GymEntity;
import com.example.gym_web_project1.domain.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Repository
public interface GymRepositories extends JpaRepository<GymEntity, Integer> {

    @Query("SELECT g FROM GymEntity g WHERE g.gymType = :gymType")
    Optional<Gym> findByGymType(@Param("gymType") String gymType);



}
