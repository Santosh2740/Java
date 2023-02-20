package com.santosh.service;

import java.util.List;

import com.santosh.model.User;

public interface UserService {

    public User addUser(User user);

    public List<User> getAllDetails();

    public User getById(Integer getById);

    public void deleteById(Integer deleteByID);

//    public List<User> updateEmployeePartially(Integer getById, User user);


}
