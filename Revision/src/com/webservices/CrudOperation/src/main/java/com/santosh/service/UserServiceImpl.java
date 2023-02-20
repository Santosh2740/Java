package com.santosh.service;

import java.util.List;

import com.santosh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santosh.Repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    //add-->>
    @Override
    public User addUser(User user) {

        User f1 = repo.save(user);

        return f1;
    }

    //get all-->>
    @Override
    public List<User> getAllDetails() {

        return repo.findAll();
    }

    //get by id-->>
    @Override
    public User getById(Integer getById) {

        return repo.findById(getById).get();


    }

    //delete
    @Override
    public void deleteById(Integer deleteByID) {

        repo.deleteById(deleteByID);

    }

//    @Override
//    public List<User> updateEmployeePartially(Integer getById, User user) {
//        return repo.findAll();
//    }
//

}

















