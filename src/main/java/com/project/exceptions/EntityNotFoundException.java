package com.project.exceptions;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(String message, Integer id){
        super(message);
    }
}
