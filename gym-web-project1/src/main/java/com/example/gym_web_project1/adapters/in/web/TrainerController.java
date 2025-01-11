package com.example.gym_web_project1.adapters.in.web;


import com.example.gym_web_project1.adapters.out.mysql.entities.TrainerEntity;
import com.example.gym_web_project1.application.usecase.TrainerUseCase;
import com.example.gym_web_project1.domain.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TrainerController {

    @Autowired
    TrainerUseCase trainerUseCase;

    @PostMapping("/saves")
    public String saveTrainer(@RequestBody Trainer trainer){
        return trainerUseCase.saveTrainer(trainer);
    }

    @GetMapping("/trainer/{trainerName}")
    public Optional<TrainerEntity> findByTrainerName(@PathVariable String trainerName){
        return trainerUseCase.findByTrainerName(trainerName);
    }

    @GetMapping("/trainerList")
    public List<TrainerEntity> findAll(){
        return trainerUseCase.findAll();
    }

    @PutMapping("/update/trainer/{id}")
    public String updateTrainer(@RequestBody Trainer trainer){

        TrainerEntity trainerEntity= new TrainerEntity();
        trainerEntity.setId(trainer.getId());
        trainerEntity.setTrainerName(trainer.getTrainerName());
        trainerEntity.setTrainerDesignation(trainer.getTrainerDesignation());
        trainerEntity.setTrainerType(trainer.getTrainerType());

        return trainerUseCase.updateTrainer(trainerEntity);
    }


}
