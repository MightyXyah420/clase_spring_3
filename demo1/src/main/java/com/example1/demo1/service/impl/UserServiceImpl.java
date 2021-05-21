package com.example1.demo1.service.impl;

import java.util.List;

import com.example1.demo1.dao.UserDao;
import com.example1.demo1.dto.UserDto;
import com.example1.demo1.model.User;
import com.example1.demo1.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User save(UserDto infoUsuario) {
        User userToSave = infoUsuario.getUserFromDto();
        return userDao.save(userToSave);
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return (List<User>) userDao.findAll();
    }

    @Override
    public User findOne(String username) {
        // TODO Auto-generated method stub
        return userDao.findByUsername(username);
    }
    
}
