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

    public String updateGymType(Gym gym) throws GymTypeNotFoundException {
//        Boolean isPresent = Optional.ofNullable(gymDao.findById(id)).isPresent();
//
//        if (!isPresent) {
//            throw new GymTypeNotFoundException(" gym type not found");
//        }
//
//        gymDao.updateGymType(gym, id);
//        return "GymType is updated";

        Boolean isPresent= Optional.ofNullable(gymDao.findByGymType(gym.getGymType())).isPresent();
              if(!isPresent){
                  throw new GymTypeNotFoundException("gym type is not found");
              }

              gymDao.updateGymType(gym);
              return "GymType is updated";
    }
    public Optional<GymEntity> findById(Integer id) {
        return gymDao.findById(id);
    }
}
