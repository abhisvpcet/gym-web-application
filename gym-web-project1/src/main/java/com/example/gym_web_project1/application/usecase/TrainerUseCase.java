package com.example.gym_web_project1.application.usecase;

import com.example.gym_web_project1.adapters.out.mysql.entities.TrainerEntity;
import com.example.gym_web_project1.application.dao.TrainerDao;
import com.example.gym_web_project1.domain.Trainer;
import com.example.gym_web_project1.infrastructure.exception.TrainerAlreadyExistException;
import com.example.gym_web_project1.infrastructure.exception.TrainerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TrainerUseCase {

    @Autowired
    TrainerDao trainerDao;

    public String saveTrainer(Trainer trainer) throws TrainerAlreadyExistException {

        Boolean isPresent = trainerDao.findByTrainerName(trainer.getTrainerName()).isPresent();

        if (isPresent) {
            throw new TrainerAlreadyExistException("Trainer is already exist");
        }

        trainerDao.saveTrainer(trainer);
        return "Trainer data is saved";
    }

    public Optional<TrainerEntity> findByTrainerName(String trainer) {
       return trainerDao.findByTrainerName(trainer);
    }

    public List<TrainerEntity> findAll(){
        return trainerDao.findAll();
    }

    public String updateTrainer(TrainerEntity trainerEntity) throws TrainerNotFoundException{

        if(trainerEntity.getId()==null){
            throw new TrainerNotFoundException("Trainer Id is required for upodate");
        }
        Boolean isPresent= trainerDao.findById(trainerEntity.getId()).isPresent();
        if(!isPresent){
            throw new TrainerNotFoundException("trainer not found");
        }
        trainerDao.updateTrainer(trainerEntity);
        return "Trainer data is updated";

    }

    public Optional<TrainerEntity> findById(Integer id){
        return trainerDao.findById(id);
    }
}
