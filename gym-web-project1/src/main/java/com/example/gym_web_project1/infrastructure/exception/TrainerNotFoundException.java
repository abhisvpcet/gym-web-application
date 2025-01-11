package com.example.gym_web_project1.infrastructure.exception;

public class TrainerNotFoundException extends RuntimeException{

    public TrainerNotFoundException(String msg){
        super(msg);
    }
}
