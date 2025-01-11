package com.example.gym_web_project1.infrastructure.exception;

public class TrainerAlreadyExistException extends RuntimeException{

    public TrainerAlreadyExistException(String msg){
        super(msg);
    }
}
