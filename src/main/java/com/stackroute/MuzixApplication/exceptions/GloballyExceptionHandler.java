package com.stackroute.MuzixApplication.exceptions;

import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
//@Log4j
public class GloballyExceptionHandler {
    @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Not all mandatory fields are filled-reason")
    @ExceptionHandler(UpdateException.class)
    public void handleUpdateException(UpdateException e){
       // log.error("Not all mandatory fields are filled", e);
    }    @ResponseStatus(value= HttpStatus.CONFLICT, reason="Track already exists-reason")
    @ExceptionHandler(UserAlreadyExistException.class)
    public void handleUserAlreadyExistsException(UserAlreadyExistException e){
        //log.error("Track already exists", e);
    }    @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Track does not exist-reason")
    @ExceptionHandler(TrackNotFoundException.class)
    public void handleTrackNotFoundException(TrackNotFoundException e){
        //log.error("Track does not exist", e);
    }
}
