//package com.stackroute.MuzixApplication.seed;
//
//import com.stackroute.MuzixApplication.domain.User;
//import com.stackroute.MuzixApplication.repository.UserRepository;
//import com.stackroute.MuzixApplication.service.UserService;
//import lombok.Data;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Component;
//
//@Component
//@Data
//@PropertySource("application.properties")
//public class Seed1 implements CommandLineRunner {
//    UserRepository userRepository;
//
//    @Autowired
//    public Seed1(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//    private User feedTrackData = new User();
//    @Value("${song.total}")
//    private int totalSongs;
//
//    @Value("${song.1.trackId}")
//    private int id1;
//    @Value("${song.1.trackName}")
//    private String name1;
//    @Value("${song.1.comment}")
//    private String comment1;
//    @Value("${song.2.trackId}")
//    private int id2;
//    @Value("${song.2.trackName}")
//    private String name2;
//    @Value("${song.2.comment}")
//    private String comment2;
//    @Value("${song.3.trackId}")
//    private int id3;
//    @Value("${song.3.trackName}")
//    private String name3;
//    @Value("${song.3.comment}")
//    private String comment3;
//
//    @Autowired
//    Environment env;
//    @Autowired
//    private UserService userServices;
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println(env.getProperty("app.name"));
//        System.out.println(env.getProperty("JAVA_HOME"));
//
//
//        feedTrackData.setTrackId(Integer.parseInt(env.getProperty("song.1.trackId")));
//        feedTrackData.setTrackName(env.getProperty("song.1.trackName"));
//        feedTrackData.setComments(env.getProperty("song.1.comment"));
//        userServices.saveUser(feedTrackData);
//
//        feedTrackData.setTrackId(Integer.parseInt(env.getProperty("song.2.trackId")));
//        feedTrackData.setTrackName(env.getProperty("song.2.trackName"));
//        feedTrackData.setComments(env.getProperty("song.2.comment"));
//        userServices.saveUser(feedTrackData);
//
//        feedTrackData.setTrackId(Integer.parseInt(env.getProperty("song.3.trackId")));
//        feedTrackData.setTrackName(env.getProperty("song.3.trackName"));
//        feedTrackData.setComments(env.getProperty("song.3.comment"));
//        userServices.saveUser(feedTrackData);
//
////        feedTrackData.setTrackId(id2);
////        feedTrackData.setTrackName(name2);
////        feedTrackData.setComments(comment2);
////        userServices.saveUser(feedTrackData);
////
////        feedTrackData.setTrackId(id3);
////        feedTrackData.setTrackName(name3);
////        feedTrackData.setComments(comment3);
////        userServices.saveUser(feedTrackData);
//   }
//}
