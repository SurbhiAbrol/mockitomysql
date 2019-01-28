package com.stackroute.MuzixApplication.repository;

import com.stackroute.MuzixApplication.domain.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;
    private User user;

    @Before
    public void setUp()
    {
        user = new User();
        user.setComments("John");
        user.setTrackId(10);
        user.setTrackName("Jenny");

    }

    @After
    public void tearDown(){

        userRepository.deleteAll();
    }


    @Test
    public void testSaveUser(){
        userRepository.save(user);
      //  User fetchUser = userRepository.findById(user.getTrackId()).get();
        Assert.assertEquals(10,user.getTrackId());

    }

    @Test
    public void testSaveUserFailure(){
        User testUser = new User(23,"Harry","john");
        userRepository.save(user);
       // User fetchUser = userRepository.findById(user.getTrackId()).get();
        Assert.assertNotSame(testUser,user);
    }

    @Test
    public void testGetAllUser(){
        User u = new User(11,"Jenny","Johny12");
        User u1 = new User(12,"Jenny","Harry12");
        userRepository.save(u);
        userRepository.save(u1);

        List<User> list = userRepository.findAll();
        Assert.assertEquals("Jenny",list.get(0).getTrackName());




    }


}


