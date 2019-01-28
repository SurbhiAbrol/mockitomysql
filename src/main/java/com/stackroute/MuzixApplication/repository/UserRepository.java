package com.stackroute.MuzixApplication.repository;

import com.stackroute.MuzixApplication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//import javax.sound.midi.Track;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

//    @Query
//    public User findByName(String name);

}

