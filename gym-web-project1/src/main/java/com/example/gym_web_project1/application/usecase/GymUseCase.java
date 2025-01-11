package com.example.gym_web_project1.application.usecase;

import com.example.gym_web_project1.adapters.out.mysql.entities.GymEntity;
import com.example.gym_web_project1.application.dao.GymDao;
import com.example.gym_web_project1.domain.Gym;
import com.example.gym_web_project1.infrastructure.GymTypeAlreadyExist;
import com.example.gym_web_project1.infrastructure.GymTypeNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymUseCase {

    @Autowired
    GymDao gymDao;

    @Transactional
    public String saveGymType(Gym gym) throws GymTypeAlreadyExist {
        Boolean isPresent= gymDao.findByGymType(gym.getGymType()).isPresent();
        if(isPresent){
            throw new GymTypeAlreadyExist("gym type already exist");
        }
         gymDao.saveGymType(gym);
        return "GymType is saved successfully";

    }
    public Optional<Gym> findByGymType(String gymType){
        return gymDao.findByGymType(gymType);

    }

    public List<GymEntity> findAll() {
        return gymDao.findAll();
    }

    public String updateGym(Gym gym) throws GymTypeNotFoundException {
        if((gym.getId()==null)){
            throw new GymTypeNotFoundException("Gym id needs to there for updating the data");
        }
      Boolean isPresent = gymDao.findById(gym.getId()).isPresent();
       if(!isPresent){
           throw new GymTypeNotFoundException("Gym id is not present");
       }
       gymDao.updateGym(gym);
       return "Gym data is updated";
    }
    public Optional<GymEntity> findById(Integer id) {
        return gymDao.findById(id);
    }
}
