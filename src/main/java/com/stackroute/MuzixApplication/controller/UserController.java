package com.stackroute.MuzixApplication.controller;

import com.stackroute.MuzixApplication.domain.User;
import com.stackroute.MuzixApplication.exceptions.TrackNotFoundException;
import com.stackroute.MuzixApplication.exceptions.UpdateException;
import com.stackroute.MuzixApplication.exceptions.UserAlreadyExistException;
import com.stackroute.MuzixApplication.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@Api(value = "TrackMusic",description = "operations pertaining to track the music")
public class UserController {
    UserService userService;

@Autowired
    public UserController(UserService userService) {
    this.userService = userService;
}

    @ApiOperation(value = "save all songs", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})

        @PostMapping("/user")

        public ResponseEntity<?> saveUser(@RequestBody User user) throws UserAlreadyExistException
        {
            ResponseEntity responseEntity;
           // try{
                userService.saveUser(user);
                responseEntity=new ResponseEntity<String>( "Created", HttpStatus.CREATED);
          //  }
            //catch (UserAlreadyExistException exception){
              //  responseEntity=new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
            //}
            return responseEntity;
        }


    @ApiOperation(value = "View a list of available songs", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
        @GetMapping("/user")
        public ResponseEntity<?> getAllUser() {
            return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
        }

    @ApiOperation(value = "Update the list of available songs", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
        @PutMapping("/user")
    public ResponseEntity<?> UpdateUser(@RequestBody User user) throws UpdateException, UserAlreadyExistException {
            ResponseEntity responseEntity;
           // try{
                userService.saveUser(user);
                responseEntity=new ResponseEntity<String>( "updated", HttpStatus.CREATED);
          //  }
          //  catch (UserAlreadyExistException exception){
               // responseEntity=new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
          //  }
            return responseEntity;

        }

    @ApiOperation(value = "delete from list of available songs", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
        @DeleteMapping("/user/{id}")
    public ResponseEntity<?> getDeleteUser( @PathVariable("id") int id) throws TrackNotFoundException{
            ResponseEntity responseEntity;
          //  try {

                userService.deleteUser(id);
                responseEntity = new ResponseEntity<String>("delete", HttpStatus.CREATED);
          //  } catch (TrackNotFoundException e) {
              //  responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
           // }
            return responseEntity;

        }
    }

