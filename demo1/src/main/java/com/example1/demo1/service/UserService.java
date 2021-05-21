package com.example1.demo1.service;

import java.util.List;

import com.example1.demo1.dto.UserDto;
import com.example1.demo1.model.User;

public interface UserService {
    User save(UserDto infoUsuario);
    List <User> findAll();
    User findOne (String username);
}
