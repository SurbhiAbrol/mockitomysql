package com.stackroute.MuzixApplication.service;

import com.stackroute.MuzixApplication.domain.User;
import com.stackroute.MuzixApplication.exceptions.TrackNotFoundException;
import com.stackroute.MuzixApplication.exceptions.UpdateException;
import com.stackroute.MuzixApplication.exceptions.UserAlreadyExistException;
import com.stackroute.MuzixApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) throws UserAlreadyExistException {
        if (userRepository.existsById(user.getTrackId())) {
            throw new UserAlreadyExistException("user already exists");
        }
        User savedUser =  userRepository.save(user);
        if (savedUser == null) {
            throw new UserAlreadyExistException("User already exists");
        }
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) throws UpdateException {
        if (userRepository.existsById(user.getTrackId())) {
            throw new UpdateException("user already exists");
        }
        User savedUser = userRepository.save(user);
        if (savedUser == null) {
            throw new UpdateException("User already exists");
        }
        return savedUser;


    }

    @Override
    public List<User> getUpdateUser() throws UpdateException {

        return userRepository.findAll();
    }

    @Override
    public boolean deleteUser(int id) throws TrackNotFoundException {
        boolean status = false;
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            status = true;

        } else {
            throw new TrackNotFoundException("tracknotfound");
        }
        return status;
    }
}

   /* @Override
    public List<User> getDeleteUser(){
        return userRepository.findAll();
    }*/
