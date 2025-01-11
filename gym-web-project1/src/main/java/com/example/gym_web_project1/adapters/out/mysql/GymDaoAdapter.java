package com.example.gym_web_project1.adapters.out.mysql;

import com.example.gym_web_project1.adapters.out.mysql.entities.GymEntity;
import com.example.gym_web_project1.adapters.out.mysql.repositories.GymRepositories;
import com.example.gym_web_project1.application.dao.GymDao;
import com.example.gym_web_project1.domain.Gym;
import com.example.gym_web_project1.infrastructure.GymTypeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class GymDaoAdapter implements GymDao {

    @Autowired
    private GymRepositories gymRepo;


    @Transactional
    @Override
    public void saveGymType(Gym gym) {
         gymRepo.save(new GymEntity(
                gym.getGymType(),
                gym.getGymFee(),
                gym.getGymLocation()
        ));
    }

    @Override
    public List<GymEntity> findAll() {
         return gymRepo.findAll();
    }

    @Override
    public void updateGym(Gym gym) {

        GymEntity oldGym= gymRepo.findById(gym.getId()).orElseThrow(()-> new GymTypeNotFoundException("gym id is not found" +gym.getId()));

        oldGym.setGymType(gym.getGymType());
        oldGym.setGymFee(gym.getGymFee());
        oldGym.setGymLocation(gym.getGymLocation());

        gymRepo.save(oldGym);


    }

    @Override
    public Optional<Gym> findByGymType(String gymType) {
        return gymRepo.findByGymType(gymType);
    }


    @Override
    public Optional<GymEntity> findById(Integer id) {
        return gymRepo.findById(id);
    }
}
