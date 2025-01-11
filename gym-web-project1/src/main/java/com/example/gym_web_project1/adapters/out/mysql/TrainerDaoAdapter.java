package com.example.gym_web_project1.adapters.out.mysql;

import com.example.gym_web_project1.adapters.out.mysql.entities.TrainerEntity;
import com.example.gym_web_project1.adapters.out.mysql.repositories.TrainerRepositories;
import com.example.gym_web_project1.application.dao.TrainerDao;
import com.example.gym_web_project1.domain.Trainer;
import com.example.gym_web_project1.infrastructure.exception.TrainerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerDaoAdapter implements TrainerDao {

    @Autowired
    TrainerRepositories trainerRepositories;

    @Transactional
    @Override
    public void saveTrainer(Trainer trainer) {
        trainerRepositories.save(new TrainerEntity(
                trainer.getTrainerName(),
                trainer.getTrainerDesignation(),
                trainer.getTrainerType()
        ));
    }

    @Override
    public List<TrainerEntity> findAll() {
        return trainerRepositories.findAll()
                .stream()
                .map(TrainerEntity-> new TrainerEntity(
                        TrainerEntity.getTrainerName(),
                        TrainerEntity.getTrainerDesignation(),
                        TrainerEntity.getTrainerType())).toList();
    }

    @Transactional
    @Override
    public void updateTrainer(TrainerEntity trainerEntity) {

        TrainerEntity existingTrainer= trainerRepositories.findById(trainerEntity.getId())
                .orElseThrow(()->new TrainerNotFoundException("trainer is not found" +trainerEntity.getId()));

        existingTrainer.setTrainerName(trainerEntity.getTrainerName());
        existingTrainer.setTrainerDesignation(trainerEntity.getTrainerDesignation());
        existingTrainer.setTrainerType(trainerEntity.getTrainerType());

        trainerRepositories.save(existingTrainer);

    }

    @Override
    public Optional<TrainerEntity> findByTrainerName(String trainerName) {
        return trainerRepositories.findByTrainerName(trainerName);
    }

    @Override
    public Optional<TrainerEntity> findById(Integer id) {
        return trainerRepositories.findById(id);
    }
}
