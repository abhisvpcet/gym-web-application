package com.example.gym_web_project1.application.dao;

import com.example.gym_web_project1.adapters.out.mysql.entities.GymEntity;
import com.example.gym_web_project1.domain.Gym;

import java.util.List;
import java.util.Optional;

public interface GymDao {


    public void saveGymType(Gym gym);

    public List<GymEntity> findAll();

    public void updateGym(Gym gym);

    Optional<Gym> findByGymType(String gymType);

    public Optional<GymEntity> findById(Integer id);

}
