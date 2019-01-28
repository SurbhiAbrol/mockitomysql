package com.stackroute.MuzixApplication.service;

import com.stackroute.MuzixApplication.domain.User;
import com.stackroute.MuzixApplication.exceptions.TrackNotFoundException;
import com.stackroute.MuzixApplication.exceptions.UpdateException;
import com.stackroute.MuzixApplication.exceptions.UserAlreadyExistException;

import java.util.List;

public interface UserService {

    public User saveUser(User user) throws  UserAlreadyExistException;
    public List<User> getAllUsers();

    public User updateUser(User user) throws UpdateException;
    public List<User> getUpdateUser() throws UpdateException;

    public boolean deleteUser(int id) throws TrackNotFoundException;
    //public List<User> getDeleteUser(int id);
}
