package com.stackroute.MuzixApplication.service;
import com.stackroute.MuzixApplication.domain.User;
import com.stackroute.MuzixApplication.exceptions.UserAlreadyExistException;
import com.stackroute.MuzixApplication.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    private User user;

    //Create a mock for UserRepository
    @Mock
    private UserRepository userRepository;

    //Inject the mocks as dependencies into UserServiceImpl
    @InjectMocks
    private UserServiceImpl userService;
    List<User> list= null;


    @Before
    public void setUp(){
        //Initialising the mock object
        MockitoAnnotations.initMocks(this);
        user = new User();
        user.setComments("John");
        user.setTrackId(10);
        user.setTrackName("Jenny");
        list = new ArrayList<>();
        list.add(user);


    }

    @Test
    public void saveUserTestSuccess() throws UserAlreadyExistException {

        when(userRepository.save((User)any())).thenReturn(user);
        User savedUser = userService.saveUser(user);
        Assert.assertEquals(user,savedUser);

        //verify here verifies that userRepository save method is only called once
        verify(userRepository,times(1)).save(user);

    }

    @Test(expected = UserAlreadyExistException.class)
    public void saveUserTestFailure() throws UserAlreadyExistException {
        when(userRepository.save((User)any())).thenReturn(null);
        User savedUser = userService.saveUser(user);
        System.out.println("savedUser" + savedUser);
        Assert.assertEquals(user,savedUser);

       /*doThrow(new UserAlreadyExistException()).when(userRepository).findById(eq(101));
       userService.saveUser(user);*/


    }

    @Test
    public void getAllUser(){

        userRepository.save(user);
        //stubbing the mock to return specific data
        when(userRepository.findAll()).thenReturn(list);
        List<User> userlist = userService.getAllUsers();
        Assert.assertEquals(list,userlist);
    }





}


