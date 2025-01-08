package com.example.gym_web_project1.adapters.in.web;


import com.example.gym_web_project1.adapters.out.mysql.entities.GymEntity;
import com.example.gym_web_project1.application.usecase.GymUseCase;
import com.example.gym_web_project1.domain.Gym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GymController {

    @Autowired
    private GymUseCase gymUseCase;

    @PostMapping("/save")
    public String saveGym(@RequestBody Gym gym){
        return gymUseCase.saveGymType(gym);
    }

    @GetMapping("/gym")
    public List<GymEntity> findAll(){
        return gymUseCase.findAll();
    }

    @PutMapping("/update/{gymType}")
    public String updateGym(@RequestBody Gym gym){
        return gymUseCase.updateGymType(gym);
    }

    @GetMapping("/{id}")
    public Optional<GymEntity> findById(@PathVariable Integer id){
        return gymUseCase.findById(id);
    }
}
