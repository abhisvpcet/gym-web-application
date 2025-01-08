package com.example.gym_web_project1.infrastructure;

public class GymTypeAlreadyExist extends RuntimeException{

    public GymTypeAlreadyExist(String msg){
        super(msg);
    }
}
