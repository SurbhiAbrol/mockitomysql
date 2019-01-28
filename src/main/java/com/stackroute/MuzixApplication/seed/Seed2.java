//package com.stackroute.MuzixApplication.seed;
//
//import com.stackroute.MuzixApplication.domain.User;
//import com.stackroute.MuzixApplication.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class Seed2 implements ApplicationListener<ContextRefreshedEvent> {
//
//UserRepository userRepository;
//    @Autowired
//    public Seed2(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        userRepository.save(new User("sourabh","ahj"));
//        userRepository.save(new User("akshita","xjh"));
//
//
//    }
//}
