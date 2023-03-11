package com.santosh.controller;

import java.util.List;

import com.santosh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.santosh.service.UserService;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService f;

    //add user
    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {

        User f1 = f.addUser(user);
        return new ResponseEntity<User>(f1, HttpStatus.CREATED);


    }

    //get all details-->>
    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllDetails() {

        List<User> f2 = f.getAllDetails();
        return new ResponseEntity<List<User>>(f2, HttpStatus.OK);


    }

    //get Details by id-->>
    @GetMapping("/getById/{getById}")
    public ResponseEntity<User> getById(@PathVariable("getById") Integer getById) {

        User f3 = f.getById(getById);
        return new ResponseEntity<User>(f3, HttpStatus.OK);


    }

    //delete
    @DeleteMapping("/delete/{deleteByID}")
    public ResponseEntity<Void> deleteById(@PathVariable("deleteByID") Integer DeleteById) {

        f.deleteById(DeleteById);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);


    }
    //update

    @PutMapping("/update")
    public ResponseEntity<User> updateByName(@RequestBody User Update) {

        User f1 = f.addUser(Update);
        return new ResponseEntity<User>(f1, HttpStatus.CREATED);
    }

}














