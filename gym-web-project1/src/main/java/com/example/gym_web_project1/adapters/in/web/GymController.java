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

    @PutMapping("/update/gym/{id}")
    public String updateGym(@RequestBody Gym gym){

        GymEntity gymEntity= new GymEntity();

        gymEntity.setId(gym.getId());
        gymEntity.setGymType(gym.getGymType());
        gymEntity.setGymFee(gym.getGymFee());
        gymEntity.setGymLocation(gym.getGymLocation());

        return gymUseCase.updateGym(gym);
    }

    @GetMapping("/{id}")
    public Optional<GymEntity> findById(@PathVariable Integer id){
        return gymUseCase.findById(id);
    }
}
