package com.example1.demo1.dao;

import java.util.Optional;

import com.example1.demo1.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserDao extends CrudRepository <User, Long>  {
    User findByUsername(String username);
    Optional<User> findById(Long id);
}
